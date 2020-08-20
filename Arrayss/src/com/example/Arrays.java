package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arrays {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(9);
		list.add(21);
		list.add(4);
		list.add(7);

		int sum = 0;

		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);

		}
		sum /= list.size();
		System.out.println(sum);
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));

	}

}
