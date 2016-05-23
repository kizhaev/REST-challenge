package com.kizhaevv.challenge.deutsche.util;

import java.util.Comparator;

/**
 * @author Vasiliy Kizhaev
 */
public class ArrayUtil {
    public static <T> int findMinIndex(T[] array, Comparator<T> comparator) {
        T min = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (comparator.compare(min, array[i]) > 0) {
                min = array[i];
                minIndex = i;
            }
        }

        return minIndex;
    }
}
