package com.zoo.animal;

public class Cats extends Animal {
	protected boolean domestic;

    
	public Cats() {
    	 super();
    }
    public Cats(String name, int age, String color, String kind,  String character, boolean domestic) {
       
        this.name = name;
        this.age = age;
        this.color = color;
        this.kind = kind;
        this.character = character;
        this.domestic = domestic;
    }

    public boolean isDomestic() {
		return domestic;
	}
	public void setDomestic(boolean domestic) {
		this.domestic = domestic;
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