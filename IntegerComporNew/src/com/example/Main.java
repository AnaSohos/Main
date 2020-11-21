package com.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        TreeSet < MyInteger2 > myint = new TreeSet < > ();

        myint.add(new MyInteger2(64));
        myint.add(new MyInteger2(120));
        myint.add(new MyInteger2(4));
        myint.add(new MyInteger2(605));

        System.out.println(" Список чисел по количеству простых делителей");
        for (MyInteger2 as: myint) {
            System.out.println(" " + as);
        }


        System.out.println("***********************************");
        System.out.println(" ");

        System.out.println("Переворот чисел");
        HashSet < MyInteger > stateInteg = new HashSet < > ();

        stateInteg.add(new MyInteger(677770));
        stateInteg.add(new MyInteger(665));
        stateInteg.add(new MyInteger(2330));
        stateInteg.add(new MyInteger(77330));

        Iterator < MyInteger > li = stateInteg.iterator();

        for (var o: stateInteg)
            System.out.println(Arrays.toString(o.str(o.getConversely())));

    }

}