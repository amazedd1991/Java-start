package ru.gb.taran.homework3;

import java.util.Arrays;
import java.util.Random;

public class HM3 {
    public static void main(String[] args) {
        massive();
        massiveHundred();
        numbersLowerSix();
        massiveDiagonal();
        massiveReturn(10, 7);
        minAndMaxElements();
    }

    public static void massive() {
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

    public static void massiveHundred() {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.print(a[i] + ", ");
        }
        System.out.println();
    }

    public static void numbersLowerSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void massiveDiagonal() {
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


    public static void massiveReturn(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void minAndMaxElements() {
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






