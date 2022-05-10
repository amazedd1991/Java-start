package ru.gb.taran.homework6;

import javax.xml.bind.SchemaOutputResolver;

public class HM6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик");
        Dog dog = new Dog("Бобик");
        Animal[] animals = new Animal[] {cat, dog};

        System.out.println("Котов = " + Cat.getCount());
        System.out.println("Собак = " + Dog.getCount());
        System.out.println("Животных = " + Animal.getCount());

        cat.run(100);
        cat.swim(5);

        dog.run(300);
        dog.swim(50);

    }

}
