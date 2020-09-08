package com.zoo.animal;

public class Rabbits extends Animal implements Jump, EatGreens {




    // ДОПОЛНИТЕЛЬНЫЕ ПОЛЯ КЛАССА

    protected int jumpHeight;

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    // КОНСТРУКТОРЫ

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

    // ОБЩИЕ

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

    // ПЕРЕГРУЗКА

    public void overload(String ferst, String second) {
        boolean result;
        result = ferst.equals(second);
        System.out.println(result);
    }


    public void overload(int num, int num1) {
        int res;
        res = num + num1;
        System.out.println(res);
    }

    // ИНТЕРФЕЙСЫ

    @Override
    public void eatGreens() {
        // TODO Auto-generated method stub

    }

    @Override
    public void jump() {
        // TODO Auto-generated method stub

    }



}