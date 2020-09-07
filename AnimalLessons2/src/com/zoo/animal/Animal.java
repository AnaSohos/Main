package com.zoo.animal;

public class Animal {

    protected String name;
    protected int age;
    protected String color;
    protected String kind;
    protected String character;




    public Animal() {

    }

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

    public void say() {
        System.out.println("Я умею говорить");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}