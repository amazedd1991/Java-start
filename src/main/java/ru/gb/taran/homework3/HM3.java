package ru.gb.taran.homework3;

import java.util.Arrays;

public class HM3 {
    public static void main(String[] args) {
        method1();
        method2();
    }

    public static void method1() {
        int[] arr = {0, 1, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.println(arr[i]);

        }
    }

    public static void method2() {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.println(a[i]);
        }
    }
}




