package ru.gb.taran.homework3;

public class HM3 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 1,0,1,1,0,0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.println(arr[i]);
        }
    }
}

