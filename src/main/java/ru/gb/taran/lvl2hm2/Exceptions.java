package ru.gb.taran.lvl2hm2;

public class Exceptions {
    public static void main(String[] args) {
        try {
            method();
        } catch (MyArrayDataException e1) {
            e1.printStackTrace();
        } catch (MyArraySizeException e2) {
            e2.printStackTrace();
        }


    }


    public static void method() throws MyArraySizeException, MyArrayDataException {
        String[][] arr = new String[4][4];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length >= 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    throw new MyArrayDataException();
                }

            }
        }

    }
}






