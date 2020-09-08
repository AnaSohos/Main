package com.zoo.animal;

public class Dogs extends Animal implements Bathe, GnawSlippers {

    protected boolean isTrained;


    public Dogs() {
        super();
    }

    //КОНСТРУКТОР

    public Dogs(String name, int age, String color, String kind, String character, boolean isTrained) {

        this.name = name;
        this.age = age;
        this.color = color;
        this.kind = kind;
        this.character = character;
        this.isTrained = isTrained;
    }

    // ДОПОЛНИТЕЛЬНОЕ ПОЛЕ ДЛЯ КЛАССА
    public boolean isTrained() {
        return isTrained;
    }
    public void setTrained(boolean isTrained) {
        this.isTrained = isTrained;
    }

    // ОБЩИЕ МЕТОДЫ

    public void say() {
        System.out.println("Гав-гав!");
    }

    public void play() {
        System.out.println("Я люблю бегать за палкой!");
    }

    public void contrive() {
        int rand = 0;
        int rand2 = 100;
        int num = rand + (int)(Math.random() * rand2);
        System.out.println("Я придумал число: " + num);

    }

    //ИНТЕРФЕЙСЫ
    @Override
    public void gnawSlippers() {
        System.out.println("Я грызу тапки хозяина, это наслаждение");

    }
    @Override
    public void bathe() {
        System.out.println("Я купаюсь!");

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



}