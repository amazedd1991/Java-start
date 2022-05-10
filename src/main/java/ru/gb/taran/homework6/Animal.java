package ru.gb.taran.homework6;

public class Animal {
    protected String name;
    private static int count = 0;

    public Animal(String name) {
        this.name = name;
        count++;

    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int run) {

    }

    public void swim(int swim) {

    }

}
