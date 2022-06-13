package ru.gb.taran.lvl2hm2;

public class Exceptions {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] arr = new String[4][4];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length > 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException();
                }

            }
        }

    }
}






