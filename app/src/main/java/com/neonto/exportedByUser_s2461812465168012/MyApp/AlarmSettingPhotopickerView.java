package com.neonto.exportedByUser_s2461812465168012.MyApp;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;

import java.io.File;


public class AlarmSettingPhotopickerView extends ImageView {

    public boolean showsPhoto;

    private Activity mOwnerActivity;
    private Object mTakePictureCallback;

    private static final int MULTICHOOSER_REQUEST = 0x5d10;
    private static final String PHOTO_TEMP_FILENAME = "tmp_photo_picker.jpg";


    public AlarmSettingPhotopickerView(Context context) {
        super(context);
        init(null, 0);
    }

    public AlarmSettingPhotopickerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public AlarmSettingPhotopickerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {
    }

    public void takePicture(Fragment caller, Object callback) {
        mOwnerActivity = caller.getActivity();
        mTakePictureCallback = callback;

        //Intent pickIntent = new Intent();
        //pickIntent.setType("image/*");
        //pickIntent.setAction(Intent.ACTION_PICK);
        Intent pickIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

        Intent takePhotoIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        // this requests a full size photo to be stored on a disk, otherwise the result could be only thumbnail sized.
        takePhotoIntent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.parse("file://"+mOwnerActivity.getExternalFilesDir(null)+"/"+PHOTO_TEMP_FILENAME));

        String pickTitle = "How do you want to take the picture?";
        Intent chooserIntent = Intent.createChooser(pickIntent, pickTitle);
        chooserIntent.putExtra(
                Intent.EXTRA_INITIAL_INTENTS,
                new Intent[] { takePhotoIntent }
        );

        caller.startActivityForResult(chooserIntent, MULTICHOOSER_REQUEST);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == MULTICHOOSER_REQUEST) {
            Bitmap image = null;

            if (resultCode != Activity.RESULT_OK) {
                if (mTakePictureCallback != null) {
                    try {
                        mTakePictureCallback.getClass().getMethod("onPictureTaken", Bitmap.class).invoke(mTakePictureCallback, image);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return;
            }

            String path;

            Uri imageUri = data != null ? data.getData() : null;
            if (imageUri != null && Uri.class.isInstance(imageUri)) { // ACTION_PICK
                Log.d("Main", "got image uri: " + imageUri);
                String[] filePathColumn = { MediaStore.Images.Media.DATA };
                Cursor cursor = mOwnerActivity.getContentResolver().query(imageUri, filePathColumn, null, null, null);
                cursor.moveToFirst();
                path = cursor.getString(cursor.getColumnIndex(filePathColumn[0]));
                cursor.close();

                image = BitmapFactory.decodeFile(path);
            } else { // ACTION_IMAGE_CAPTURE
                File file = new File(mOwnerActivity.getExternalFilesDir(null), PHOTO_TEMP_FILENAME);
                path = file.getPath();

                imageUri = Uri.fromFile(file);
                try {
                    image = MediaStore.Images.Media.getBitmap(mOwnerActivity.getContentResolver(), imageUri);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }

            // fix orientation
            try {
                ExifInterface exif = new ExifInterface(path);
                int orientation = exif.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
                Matrix matrix = new Matrix();
                switch (orientation) {
                    case 6: matrix.postRotate(90); break;
                    case 3: matrix.postRotate(180); break;
                    case 8: matrix.postRotate(270); break;
                }
                image = Bitmap.createBitmap(image, 0, 0, image.getWidth(), image.getHeight(), matrix, false);
            }
            catch (Exception e) {}

            mOwnerActivity = null;

            /*if (image == null) {
                try {
                    image = (Bitmap) data.getExtras().get("data");
                } catch (Exception e) {
                }
            }*/

            if (Bitmap.class.isInstance(image)) {
                int w = image.getWidth();
                int h = image.getHeight();
                Log.d("PhotoPicker", "picture size: "+w+", "+h);
                if (w > 1200) {
                    h = Math.round( (float)h / (w / 1200.0f) );
                    w = 1200;
                }
                if (h > 1200) {
                    w = Math.round( (float)w / (h / 1200.0f) );
                    h = 1200;
                }
                if (w != image.getWidth() || h != image.getHeight()) {
                    Log.d("PhotoPicker", String.format("scaling picture from %d*%d to %d*%d", image.getWidth(), image.getHeight(), w, h));
                    Bitmap scaled = Bitmap.createScaledBitmap(image, w, h, true);
                    image.recycle();
                    image = scaled;
                }

                if (mTakePictureCallback != null) {
                    try {
                        mTakePictureCallback.getClass().getMethod("onPictureTaken", Bitmap.class).invoke(mTakePictureCallback, image);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                if (showsPhoto) {
                    this.setImageBitmap(image);
                }
            }
        }
    }
}
