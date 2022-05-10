package ru.gb.taran.homework6;

public class Dog extends Animal {
    private static int count = 0;
    public Dog(String name) {
        super(name);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(getName() + " пробежал " + distance + " метров ");
        } else {
            System.out.println(getName() + " может пробежать максимум 500 метров !!!");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance >= 0 && distance <= 10) {
            System.out.println(getName() + " проплыл " + distance + " метров ");
        } else {
            System.out.println(getName() + " может проплыть максимум 10 метров !!!");
        }
    }
}
