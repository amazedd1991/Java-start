package ru.gb.taran.homework6;

public class Cat extends Animal {
    private static int count;

    public Cat(String name) {
        super(name);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(getName() + " пробежал " + distance + " метров ");
        } else {
            System.out.println(getName() + " может пробежать максимум 200 метров !!!");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance >= 0) {
            System.out.println(getName() + " не умеет плавать !!!");
        } else {
            System.out.println("Введеное число должно быть положительным !!!");
        }
    }
}



