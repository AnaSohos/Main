package com.zoo.animal;

public class Foxs extends Animal {


    public Foxs() {

    }
    public Foxs(String name, int age, String kind, String color, boolean successfulPredator) {
        super();
        this.name = name;
        this.age = age;
        this.kind = kind;
        this.color = color;
        this.successfulPredator = successfulPredator;
    }


    public void say() {
        System.out.println("Тяф!");
    }

    public void play() {
        System.out.println("Обожаю играть в карты!");
    }

    public void contrive() {
        int rand = 0;
        int rand2 = 100;
        int num = rand + (int)(Math.random() * rand2);
        System.out.println("Я придумал число: " + num);

    }

    public void hunts() {
        System.out.println("Я охочусь");

    }

    public void protectTerritory() {
        System.out.println("Я охраняю территорию");

    }
}