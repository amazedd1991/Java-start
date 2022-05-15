package ru.gb.taran.HM7;

public class Plate {
    public int food;


    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }
    public void addFood(int x){
        food += x;
    }

    public void info() {
        System.out.println("На тарелке " + food + " еды");
    }
}