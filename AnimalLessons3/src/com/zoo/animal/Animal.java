package com.zoo.animal;

public abstract class Animal {

    protected String name;
    protected int age;
    protected String color;
    protected String kind;
    protected String character;




    public Animal() {

    }

    //ПЕРЕГРУЗКА

    abstract void overload(String ferst, String second);

    abstract void overload(int num, int num2);


    // ОБЩИЕ МЕТОДЫ ДЛЯ ВСЕХ КЛАССОВ

    abstract void say();

    abstract void play();

    abstract void contrive();


    public int getAge() {
        return age;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}