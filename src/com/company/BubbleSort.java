package com.company;

public class BubbleSort {
    static  int [] list = {2, 5, 1, 8, 6, 3, 0, 9};

    public static void bubbleSort(int[] list) {
//        boolean needNextPass = true;
//
//        for (int k = 1; k < list.length && needNextPass; k++) {
//            /* Array may be sorted and next pass not needed */
//            needNextPass = false;
//            for (int i = 0; i < list.length - k; i++) {
//                if (list[i] > list[i + 1]) {
//                    /* Swap list[i] with list[i + 1] */
//                    int temp = list[i];
//                    list[i] = list[i + 1];
//                    list[i + 1] = temp;
//
//                    needNextPass = true; /* Next pass still needed */
//                }
//            }
//        }
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = list.length - 1; j > i; j--)
                if (list[j] < list[j - 1]) {
                    int temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                }
        }
    }
}
