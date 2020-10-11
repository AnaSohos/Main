package com.example;

public class Animal extends java.lang.Object {

    private String name;

    public Animal() {}

    public Animal(java.lang.String name) {
        this.name = name;
    }


    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Animal animal = (Animal) object;
        return java.util.Objects.equals(name, animal.name);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), name);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Animal{" +
                "name=" + name +
                '}';
    }



    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }
}