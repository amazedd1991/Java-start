package ru.gb.taran.homework2;

public class HM2 {
    public static void main(String[] args) {
        summary(5, 5);
        positiveOrNegative(1);
        trueNumber(1);
        stringsAndNumbers("Hallo world!!!", 3);

    }

    public static boolean summary(int a, int b) {
        int calcSum = a + b;
        if (calcSum >= 10 && calcSum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void positiveOrNegative(int i) {
        if (i > 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }

    public static boolean trueNumber(int i) {
        if (i < 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void stringsAndNumbers(String words, int number) {
        for (int i = 0; i < 3; i++) {
            System.out.println(words);

        }

    }


}

