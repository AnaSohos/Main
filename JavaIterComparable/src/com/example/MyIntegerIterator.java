package com.example;

import java.util.ArrayList;
import java.util.Iterator;


    public class MyIntegerIterator<M> implements Iterator<MyInteger>, Iterable <MyInteger> {
        private final ArrayList<MyInteger> myinteger;

        public ArrayList<MyInteger> getMyinteger() {
            return myinteger;
        }

        private int sds = 0;
        private int position;
        private int pos;

        public int getSds() {
            return sds;
        }

        public void setSds(int sds) {
            this.sds = sds;
        }

        public MyIntegerIterator(ArrayList<MyInteger> myinteger) {
            this.myinteger = myinteger;
            this.position = myinteger.size() - 1;
        }


        @Override
        public String toString() {
            return "MyIntegerIterator{" +
                    "myinteger=" + myinteger +
                    ", sds=" + sds +
                    ", position=" + position +
                    '}';
        }
        @Override
        public boolean hasNext() {

                for(int i = 0; i < myinteger.size(); i++) {
                    myinteger.get(pos).str(next().getNum());
                    System.out.println(" ");
                }

            return pos < myinteger.size();

        }

        @Override
        public MyInteger next()  {


                return myinteger.get(pos++);
        }

        @Override
        public Iterator<MyInteger> iterator() {
            return this;
        }
    }

