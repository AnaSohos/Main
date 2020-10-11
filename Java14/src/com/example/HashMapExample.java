package com.example;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapExample {
    public void change(HashMap < Integer, Animal > tt, Animal elem, int key) throws MapException {

        if (tt.containsKey(key) != true) {
            switch (key) {
                case 1:
                    tt.put(key, elem);
                    break;
                case 2:
                    tt.put(key, elem);
                    break;
                case 3:
                    tt.put(key, elem);
                    break;
                case 4:
                    tt.put(key, elem);
                    break;
                case 5:
                    tt.put(key, elem);
                    break;
            }

        } else {
            throw new MapException("Такого вольера нет");
        }


    }
}