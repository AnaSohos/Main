package com.zoo.animal;

public class Raccoons extends Animal implements Rinse, Steal {

    //КОНСТРУКТОРЫ

    public Raccoons() {
        super();
    }
    public Raccoons(String name, int age, String color, String kind, String character) {

        this.name = name;
        this.age = age;
        this.color = color;
        this.kind = kind;
        this.character = character;

    }

    // ОБЩИЕ МЕТОДЫ

    public void say() {
        System.out.println("У-ррр!");
    }

    public void play() {
        System.out.println("Я люблю террорить и наседать!");
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
    public void steal() {
        System.out.println("Обожаю воровать! Это всегда так вкусно!");

    }
    @Override
    public void rinse() {
        System.out.println("Я все полощу!");

    }



}