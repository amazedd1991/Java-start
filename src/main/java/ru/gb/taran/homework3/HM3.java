package ru.gb.taran.homework3;

public class HM3 {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
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

    public static void method3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 6) {
                arr[i] *= 2;
            }
            System.out.println(arr[i]);
        }
    }
}




