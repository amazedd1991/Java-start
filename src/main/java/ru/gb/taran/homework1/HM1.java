package ru.gb.taran.homework1;

public class HM1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 10;
        a = a + b;
        if(a >= 0 ) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 10;
        if(value <= 0 ) {
            System.out.println("Красный");
        } else if (value >= 0 && value <= 100) {
            System.out.println("Желтый");
        } else if(value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 30;
        int b = 20;
        if(a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }


    }
}




