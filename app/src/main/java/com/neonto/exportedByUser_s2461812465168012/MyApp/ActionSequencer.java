package com.neonto.exportedByUser_s2461812465168012.MyApp;

import android.app.Activity;

import java.util.ArrayList;

public class ActionSequencer {

    public interface Action {
        public boolean execute();
    }

    public interface FinishAction {
        public void execute();
    }

    private Activity mActivity;
    private Action[] mActions;
    private int mCurrentAction;

    private ArrayList<FinishAction> mFinishActions;

    public void run(Activity activity, Action[] actions) {
        mActivity = activity;
        mActions = actions;
        mCurrentAction = 0;

        mFinishActions = new ArrayList();

        runNextAction();
    }

    public void resume() {
        mActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (mActions != null && mCurrentAction < mActions.length) {
                    runNextAction();
                } else {
                    // sequence finished
                    runAndClearFinishActions();

                    mActions = null;
                    mCurrentAction = 0;
                }
            }
        });
    }

    public void cancel() {
        runAndClearFinishActions();

        mActions = null;
        mCurrentAction = 0;
    }

    public void addFinishAction(FinishAction action) {
        mFinishActions.add(action);
    }

    private void runNextAction() {
        while (mActions != null && mCurrentAction < mActions.length) {
            Action action = mActions[mCurrentAction++];

            if (!action.execute()) {
                break;
            }

            // sequence finished
            if(mCurrentAction == mActions.length) {
                runAndClearFinishActions();

                mActions = null;
                mCurrentAction = 0;
            }
        }
    }

    private void runAndClearFinishActions() {
        for (FinishAction action : mFinishActions) {
            action.execute();
        }

        mFinishActions.clear();
    }

}
