package ru.gb.taran.HM7;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void addFood(int x) {
        food += x;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("На тарелке " + food + " еды");
    }
}