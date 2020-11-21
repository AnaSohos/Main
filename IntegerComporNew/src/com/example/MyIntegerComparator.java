package com.example;
import java.util.Comparator;

public class MyIntegerComparator implements Comparator < MyInteger2 > {


    @Override
    public int compare(MyInteger2 o1, MyInteger2 o2) {
        return o1.rec(o1.getNum()).compareTo(o2.rec(o2.getNum()));
    }
}
