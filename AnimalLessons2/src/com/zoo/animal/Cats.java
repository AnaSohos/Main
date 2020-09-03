package com.zoo.animal;

public class Cats extends Animal {


    public Cats() {

    }
    public Cats(String name, int age, String breed, String color, boolean domestic) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.domestic = domestic;
    }



    public void say() {
        System.out.println("Мяу");
    }

    public void play() {
        System.out.println("Люблю играть в салки");
    }

    public void contrive() {
        int rand = 0;
        int rand2 = 100;
        int num = rand + (int)(Math.random() * rand2);
        System.out.println("Я придумал число: " + num);

    }

    public void stretching() {
        System.out.println("Я каждый день растягиваюсь");

    }

    public void sharpenClaws() {
        System.out.println("Я точу коготочки");

    }

}