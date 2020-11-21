package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class MyInteger implements Iterable < Integer > {

    private Integer conversely;
    private ArrayList < MyInteger > myinteger;

    //Функция
    public Integer[] str(Integer conversely) {
        int j = 0;
        int len = Integer.toString(conversely).length();
        int[] arr = new int[len];
        while (conversely != 0) {
            arr[len - j - 1] = conversely % 10;
            conversely = conversely / 10;
            j++;
        }
        Integer[] arr2 = new Integer[arr.length];
        for (int i = arr.length - 1; i > 0;) {
            for (int s = 0; s < arr.length; s++) {
                arr2[s] = arr[i];
                i--;
            }
        }
        return arr2;
    }


    public MyInteger() {

    }

    public MyInteger(Integer conversely) {
        this.conversely = conversely;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyInteger integers = (MyInteger) o;
        return Objects.equals(getConversely(), integers.getConversely()) &&
                Objects.equals(getMyinteger(), integers.getMyinteger());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getConversely(), getMyinteger());
    }



    public ArrayList < MyInteger > getMyinteger() {
        return myinteger;
    }

    public void setMyinteger(ArrayList < MyInteger > myinteger) {
        this.myinteger = myinteger;
    }

    public Integer getConversely() {
        return conversely;
    }

    public void setConversely(Integer conversely) {
        this.conversely = conversely;
    }

    @Override
    public String toString() {
        return "MyInteger{" +
                "num=" +
                ", conversely=" + String.valueOf(this.conversely) +
                '}';


    }


    @Override
    public Iterator iterator() {
        {
            return new ItInteger(myinteger);
        }
    }

}



class ItInteger implements Iterator < MyInteger > {
    private final ArrayList < MyInteger > myinteger;
    private int pos;

    ItInteger(ArrayList < MyInteger > myinteger) {
        this.myinteger = myinteger;
    }

    @Override
    public boolean hasNext() {
        for (int i = 0; i < myinteger.size(); i++) {
            myinteger.get(pos).str(next().getConversely());
            System.out.println(" ");


        }

        return pos < myinteger.size();
    }

    @Override
    public MyInteger next() {
        return myinteger.get(pos++);
    }
}