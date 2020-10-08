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


        HashMap < Integer, Animal > mapSet = new HashMap < Integer, Animal > ();
        HashMapExample hashmap = new HashMapExample();

        var resmap = mapSet.put(1, cat);
        var resmap2 = mapSet.put(2, dog);
        var resmap3 = mapSet.put(3, pig);
        var resmap4 = mapSet.put(4, tiger);
        var resmap5 = mapSet.put(5, elephant);
        //var resmap6 = mapSet.put(6,jaguar);
        //var resmap7 = mapSet.put(6, rabbit);


        hashmap.change(mapSet, jaguar, 6);



        System.out.println("Размер мэпсэта = " + mapSet.size());

        System.out.println("****");
        System.out.println(mapSet.values());
        System.out.println(mapSet.keySet());


        HashSet < Animal > hashSet = new HashSet < Animal > ();
        HashSetExample hash = new HashSetExample();


        /*
                var result1 = hashSet.add(cat);
                var result2 = hashSet.add(dog);
                var result3 = hashSet.add(pig);
                var result4 = hashSet.add(tiger);
                var result5 = hashSet.add(elephant);
                var result6 = hashSet.add(jaguar);*/


        hash.addToSet(hashSet, cat);
        hash.addToSet(hashSet, dog);
        hash.addToSet(hashSet, pig);
        hash.addToSet(hashSet, tiger);
        hash.addToSet(hashSet, elephant);
        hash.addToSet(hashSet, jaguar);


        System.out.println("Размер хэшсэта = " + hashSet.size());

        for (Animal i: hashSet) System.out.println(i);





    }



}