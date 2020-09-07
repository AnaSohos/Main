package com.zoo.animal;

public class Rabbits extends Animal {

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    protected int jumpHeight;

    public Rabbits() {
        super();
    }

    public Rabbits(String name, int age, String color, String kind, String character, int jumpHeight) {
        super();
        this.name = name;
        this.age = age;
        this.character = character;
        this.kind = kind;
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