package ru.gb.taran.HM7;


public class MainClass {
    public static void main(String[] args) {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Барсик", 10);
        cats[1] = new Cat("Мурзик", 15);
        cats[2] = new Cat("Мурка", 60);


        Plate plate = new Plate(50);
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].isSatiety() == false && cats[i].getAppetite() < plate.getFood()) {
                cats[i].eat(plate);
                cats[i].setSatiety(true);
                System.out.println(cats[i].getName() + " покушал!");
            } else {
                System.out.println(cats[i].getName() + " не покушал!");
            }

        }
        plate.info();
        plate.addFood(20);
        plate.info();
    }

}

