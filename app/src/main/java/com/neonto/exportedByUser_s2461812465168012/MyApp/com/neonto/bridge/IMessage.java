package com.neonto.exportedByUser_s2461812465168012.MyApp.com.neonto.bridge;

import android.support.annotation.NonNull;

import java.util.Comparator;
import java.util.Map;

/**
 * Created by user on 16/5/2018.
 */

public interface IMessage {


    public static final class ValueEntry implements Comparable<IMessage.ValueEntry> {
        public static final Comparator<IMessage.ValueEntry> COMPARATOR = new Comparator<ValueEntry>() {
            @Override
            public int compare(IMessage.ValueEntry valueOne, IMessage.ValueEntry valueTwo) {
                if (null == valueOne) {
                    return (null == valueTwo ? 0 : -1);
                } else if (null == valueTwo) {
                    return 1;
                } else if (valueOne == valueTwo) {
                    return 0;
                } else {
                    return (valueOne.processValue - valueTwo.processValue);
                }
            }
        };
        private int processValue;

        public int compareTo(IMessage.ValueEntry other) {
            return COMPARATOR.compare(this, other);
        }
    }
}
