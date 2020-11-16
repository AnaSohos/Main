package com.zoo.animal;

public class Raccoons {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
    public void rinse() {
        System.out.println("Я все полощу!");

    }

    public void steal() {
        System.out.println("Обожаю воровать! Это всегда так вкусно!");

    }


}