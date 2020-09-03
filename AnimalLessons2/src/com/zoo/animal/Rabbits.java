package com.zoo.animal;

public class Rabbits extends Animal {

    public Rabbits() {

    }

    public Rabbits(String name, int age, String character, String color, int jumpHeight) {
        super();
        this.name = name;
        this.age = age;
        this.character = character;
        this.color = color;
        this.jumpHeight = jumpHeight;

    }

    public void say() {
        System.out.println("П-фффф!");
    }
    public void play() {
        System.out.println("Я играю в футбол!");
    }

    public void contrive() {
        int rand = 0;
        int rand2 = 100;
        int num = rand + (int)(Math.random() * rand2);
        System.out.println("Я придумал число: " + num);

    }
    public void jump() {
        System.out.println("Я прыгаю");

    }

    public void eatGreens() {
        System.out.println("Люблю зелень");

    }


}