package com.example;
import java.util.*;


public class Great {

    public static void main(String[] args) throws Exception {

        Animal cat = new Animal("Себасьян");
        Animal dog = new Animal("Дик");
        Animal pig = new Animal("Мось");
        Animal tiger = new Animal("Лео");
        Animal elephant = new Animal("Вик");
        Animal jaguar = new Animal("Рокки");
        Animal rabbit = new Animal("Джон");




        HashSet < Animal > hashSet = new HashSet < Animal > ();
        HashSetExample hash = new HashSetExample();

        try {
            hash.addToSet(hashSet, cat);
            hash.addToSet(hashSet, dog);
            hash.addToSet(hashSet, pig);
            hash.addToSet(hashSet, tiger);
            hash.addToSet(hashSet, elephant);
            hash.addToSet(hashSet, jaguar);
        } catch (MyException e) {
            e.printStackTrace();
        }




        System.out.println("Размер hashSet = " + hashSet.size());

        for (Animal i: hashSet) System.out.println(i);


        HashMap < Integer, Animal > mapSet = new HashMap < Integer, Animal > ();
        HashMapExample hashmap = new HashMapExample();

        mapSet.put(1, cat);
        mapSet.put(2, dog);
        mapSet.put(3, pig);
        mapSet.put(4, tiger);
        mapSet.put(5, elephant);



        try {

            hashmap.change(mapSet, cat, 1);
            hashmap.change(mapSet, dog, 2);
            hashmap.change(mapSet, pig, 3);
            hashmap.change(mapSet, tiger, 4);
            hashmap.change(mapSet, elephant, 5);
            hashmap.change(mapSet, jaguar, 6);
            hashmap.change(mapSet, rabbit, 5);

        } catch (MapException e) {
            e.printStackTrace();


        }


        System.out.println("Размер  mapSet = " + mapSet.size());

        System.out.println("****");
        System.out.println(mapSet.values());
        System.out.println(mapSet.keySet());



    }



}