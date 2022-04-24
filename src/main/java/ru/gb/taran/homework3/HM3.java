package ru.gb.taran.homework3;

import java.util.Arrays;
import java.util.Random;

public class HM3 {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
        method5(10, 7);
        method6();
    }

    public static void method1() {
        int[] arr = {0, 1, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + ", ");

        }
        System.out.println();
    }

    public static void method2() {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.print(a[i] + ", ");
        }
        System.out.println();
    }

    public static void method3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void method4() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i + j == 4) {
                    System.out.print("1" + ", ");
                } else {
                    System.out.print("0" + ", ");
                }
            }
            System.out.println();
        }
    }


    public static void method5(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void method6() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(101);
        }
        System.out.println(Arrays.toString(arr));

        int minNumber = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minNumber > arr[i]) {
                minNumber = arr[i];
            }
        }
        System.out.print("Минимальное число: " + minNumber);

        int maxNumber = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxNumber < arr[i]) {
                maxNumber = arr[i];
            }
        }
        System.out.println();
        System.out.print("Максимальное число: " + maxNumber);
    }


}






