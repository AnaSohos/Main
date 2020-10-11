package com.zoo.animal;

public class Cats extends Animal implements Stretching, SharpenClaws {
    protected boolean domestic;


    public Cats() {
        super();
    }

    //КОНСТРУКТОР
    public Cats(String name, int age, String color, String kind, String character, boolean domestic) {

        this.name = name;
        this.age = age;
        this.color = color;
        this.kind = kind;
        this.character = character;
        this.domestic = domestic;
    }

    // ДОПОЛНИТЕЛЬНОЕ ПОЛЕ КЛАССА
    public boolean isDomestic() {
        return domestic;
    }
    public void setDomestic(boolean domestic) {
        this.domestic = domestic;
    }

    //ОБЩИЕ
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


    //ПЕРЕГРУЗКА

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

    //ИНТЕРФЕЙСЫ

    @Override
    public void sharpenClaws() {
        System.out.println("Я точу коготочки");
    }
    @Override
    public void stretching() {
        System.out.println("Я каждый день растягиваюсь");

    }








}