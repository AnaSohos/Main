package com.zoo.animal;

public class Panthers extends Animal implements WalkAtNight, MarkBoundaries {

    protected boolean successfulPredator;

    public Panthers() {
        super();
    }

    //КОНСТРУКТОР
    
    public Panthers(String name, int age, String character, String color, String kind, boolean successfulPredator) {
        super();
        this.name = name;
        this.age = age;
        this.character = character;
        this.kind = kind;
        this.color = color;
        this.successfulPredator = successfulPredator;

    }


    // ДОПОЛНИТЕЛЬНОЕ ПОЛЕ КЛАССА
    
    public boolean isSuccessfulPredator() {
        return successfulPredator;
    }
    public void setSuccessfulPredator(boolean successfulPredator) {
        this.successfulPredator = successfulPredator;
    }


    // ОБЩИЕ МЕТОДЫ
    public void say() {
        System.out.println("Мау!");
    }

    public void play() {
        System.out.println("Я люблю охотиться, это моя игра!");
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
    public void markBoundaries() {
        // TODO Auto-generated method stub

    }
    @Override
    public void walkAtNight() {
        // TODO Auto-generated method stub

    }




}