package ru.gb.taran.level2;

public class Main {
    public static void main(String[] args) {

        Teamable[] players = {
                new Cat("Мурзик", 3, 120),
                new Robot("Синхрофазатрон", 15, 300),
                new Human("Василий", 4, 200)
        };

        Obstacle[] obstacles = {
                new Track(150), new Wall(3)
        };

        for (Obstacle obstacle : obstacles) {
            for (Teamable teamable : players) {
                obstacle.overcome(teamable);
            }
        }

        System.out.println("Всю дистанцию прошёл ");

        for (Teamable teamable : players) {
            if (teamable.isAbleToPlay()) {
                System.out.println(teamable);
            }
        }
    }

}

