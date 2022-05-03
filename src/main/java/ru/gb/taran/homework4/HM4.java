package ru.gb.taran.homework4;

import java.util.Random;
import java.util.Scanner;

public class HM4 {
    public static char[][] map;
    public static int SIZE = 3;
    public static int CHIPS_TO_WIN = 3;
    public static char CELL_EMPTY = '*';
    public static char CELL_X = 'X';
    public static char CELL_O = 'O';

    public static void main(String[] args) {
        loadMap();
        mapToConsole();
        while (true) {
            humanTurn();
            mapToConsole();
            if (checkWin(CELL_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            computerTurn();
            mapToConsole();
            if (checkWin(CELL_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }


    public static void loadMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = CELL_EMPTY;
            }
        }
    }

    public static void mapToConsole() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = CELL_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == CELL_EMPTY) return true;
        return false;
    }

    public static Random random = new Random();

    public static void computerTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = random.nextInt() - 1;
            y = random.nextInt() - 1;
        } while (!isCellValid(x, y));
        System.out.println("Ход компьютора " + (x + 1) + " " + (y + 1));
        map[y][x] = CELL_O;
    }

    public static boolean checkWin(char symb) {
        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == CELL_EMPTY)
                    return false;
            }
        }
        return true;
    }

}

