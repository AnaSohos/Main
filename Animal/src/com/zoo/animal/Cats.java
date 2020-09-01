package com.zoo.animal;

public class Cats {

    protected String name;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


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

    public void stretching() {
        System.out.println("Я каждый день растягиваюсь");

    }

    public void sharpenClaws() {
        System.out.println("Я точу коготочки");

    }

}