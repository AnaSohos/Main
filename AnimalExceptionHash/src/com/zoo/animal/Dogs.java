package com.zoo.animal;

public class Dogs {
    protected String name;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


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

    public void bathe() {
        System.out.println("Я купаюсь!");

    }

    public void gnawSlippers() {
        System.out.println("Я грызу тапки хозяина, это наслаждение");

    }

}