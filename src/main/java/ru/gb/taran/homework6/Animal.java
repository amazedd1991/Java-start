package ru.gb.taran.homework6;

public abstract class Animal {
    protected String name;
    private static int count;

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

    public abstract void run(int distance);

    public abstract void swim(int distance);

}
