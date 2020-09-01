package com.zoo.animal;

public class Rabbits {
    protected String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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