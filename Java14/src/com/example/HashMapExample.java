package com.example;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapExample {
    public void change(HashMap < Integer, Animal > tt, Animal elem, int key) throws Exception {
        if (tt.values() != null) {
            tt.replace(key, elem);
        }
        if (tt.containsKey(key) == true) {
            tt.replace(key, elem);

        } else {
            throw new Exception("Такого вольера нет");
        }
    }
}