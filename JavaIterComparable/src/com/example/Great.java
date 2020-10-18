package com.example;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.TreeSet;


public class Great {

	public static void main(String[] args) {


		var des = new MyInteger(640);
		var des2 = new MyInteger(120);
		var des3 = new MyInteger(46);
		var des4 = new MyInteger(77);


		var myint = new TreeSet < MyInteger > ();

		myint.add(new MyInteger(64));
		myint.add(new MyInteger(120));
		myint.add(new MyInteger(4));
		myint.add(new MyInteger(605));

		System.out.println(" Список чисел по количеству простых делителей" );
		for (MyInteger a: myint) {
			System.out.println(" " + a);
		}


		System.out.println("***********************************");


		ArrayList < MyInteger > stateInteg = new ArrayList < MyInteger > ();
		ListIterator li = stateInteg.listIterator(stateInteg.size());


		stateInteg.add(new MyInteger(677770));
		stateInteg.add(new MyInteger(665));
		stateInteg.add(new MyInteger(2330));
		stateInteg.add(new MyInteger(77330));


		System.out.println("Переворот чисел" );
		for (MyInteger s: new MyIntegerIterator < MyInteger > (stateInteg)) {
			System.out.println(s);
		}

	}



}