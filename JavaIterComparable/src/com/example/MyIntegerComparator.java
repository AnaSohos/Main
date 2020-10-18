package com.example;

import java.util.Comparator;

public class MyIntegerComparator implements Comparator < MyInteger > {


	@Override
	public int compare(MyInteger o1, MyInteger o2) {

		return o1.rec(o1.getNum()).compareTo(o2.rec(o2.getNum()));


	}

}