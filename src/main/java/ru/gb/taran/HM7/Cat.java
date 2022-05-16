package ru.gb.taran.HM7;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }



    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}