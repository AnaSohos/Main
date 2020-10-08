package com.example;
import java.util.HashSet;

public class HashSetExample {
    public void addToSet(HashSet < Animal > tt, Animal elem) throws Exception {
        if (tt.size() < 5)
            tt.add(elem);
        else {
            throw new Exception("Вольер переполнен");


        }
    }
}