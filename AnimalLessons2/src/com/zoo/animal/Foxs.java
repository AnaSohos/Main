package com.zoo.animal;

public class Foxs extends Animal {


    public Foxs() {
        super();
    }
    public Foxs(String name, int age, String color, String kind, String character) {

        this.name = name;
        this.age = age;
        this.color = color;
        this.kind = kind;
        this.character = character;
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