package com.zoo.animal;

public class Animal {

    protected String name;
    protected int age;
    protected String color;
    protected String breed;
    protected String kind;
    protected boolean isTrained;
    protected boolean successfulPredator;
    protected String character;
    protected boolean domestic;
    protected int jumpHeight;


    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public boolean isSuccessfulPredator() {
        return successfulPredator;
    }

    public void setSuccessfulPredator(boolean successfulPredator) {
        this.successfulPredator = successfulPredator;
    }

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

    public boolean isDomestic() {
        return domestic;
    }

    public void setDomestic(boolean domestic) {
        this.domestic = domestic;
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean isTrained) {
        this.isTrained = isTrained;
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