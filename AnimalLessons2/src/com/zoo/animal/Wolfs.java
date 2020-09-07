package com.zoo.animal;

public class Wolfs extends Animal {

    public Wolfs() {
        super();
    }

    public Wolfs(String name, int age, String color, String kind, String character) {

        this.name = name;
        this.age = age;
        this.color = color;
        this.kind = kind;
        this.character = character;


    }

    public void say() {
        System.out.println("у-ууу!");
    }

    public void play() {
        System.out.println("Я играю в прятки!");
    }

    public void contrive() {
        int rand = 0;
        int rand2 = 100;
        int num = rand + (int)(Math.random() * rand2);
        System.out.println("Я придумал число: " + num);

    }

    public void howl() {
        System.out.println("Я вою!");

    }

    public void gatherInFlock() {
        System.out.println("Я занимаю свое место в стае!");

    }



}