package ru.gb.taran.homework6;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Random;

public class HM6 {
    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("Мурзик"),
                new Cat("Мурка"),
                new Cat("Барсик"),
                new Dog("Бобик"),
        };

        final Random random = new Random();
        for (Animal animal : animals) {
            animal.run(random.nextInt(500));
            animal.swim(random.nextInt(20));
        }

        System.out.println("Котов = " + Cat.getCount());
        System.out.println("Собак = " + Dog.getCount());
        System.out.println("Животных = " + Animal.getCount());
    }

}
