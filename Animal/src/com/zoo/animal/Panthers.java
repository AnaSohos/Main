package com.zoo.animal;

public class Panthers {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("Мау!");
    }

    public void play() {
        System.out.println("Я люблю охотиться, это моя игра!");
    }


    public void contrive() {
        int rand = 0;
        int rand2 = 100;
        int num = rand + (int)(Math.random() * rand2);
        System.out.println("Я придумал число: " + num);

    }
    public void walkAtNight() {
        System.out.println("Я гуляю ночью");

    }

    public void markBoundaries() {
        System.out.println("Я мечу свою территорию");

    }



}