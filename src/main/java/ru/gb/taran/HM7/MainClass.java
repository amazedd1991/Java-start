package ru.gb.taran.HM7;


public class MainClass {
    public static void main(String[] args) {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Барсик",10,false);
        cats[1] = new Cat("Мурзик",15,false);
        cats[2] = new Cat("Мурка",60,false);


        Plate plate = new Plate(50);
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            if(cats[i].satiety == false && cats[i].appetite < plate.food){
                cats[i].eat(plate);
                cats[i].satiety = true;
                System.out.println(cats[i].name + " покушал!");
            }
            else {
                System.out.println(cats[i].name + " не покушал!");
            }

        }
        plate.info();
        System.out.println("Сколько еды добавить в тарелку ?");
        plate.addFood(20);
        plate.info();
    }

}

