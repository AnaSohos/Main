package com.example;

import java.util.Comparator;
import java.util.Objects;

public class MyInteger2 implements Comparable < MyInteger2 > {
    private Integer num;


    // функция
    public Integer rec(Integer num) {
        Integer count = 0;
        int a = 2;
        while (a <= num) {
            while ((num % a) == 0) {

                num /= a;
                count++;

            }
            a++;
        }

        return count;
    }


    public MyInteger2() {

    }


    public MyInteger2(Integer num) {
        this.num = num;
    }


    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyInteger2 that = (MyInteger2) o;
        return Objects.equals(getNum(), that.getNum());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNum());
    }



    @Override
    public String toString() {
        return "" + String.valueOf(this.num);
    }


    @Override
    public int compareTo(MyInteger2 o) {
        return rec(this.num).compareTo(rec(o.num));
    }
}