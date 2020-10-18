package com.example;

import java.util.*;

public class MyInteger implements Comparable < MyInteger > {
	private Integer num;

	public MyInteger() {}

	public MyInteger(Integer num) {
		this.num = num;
	}



	@Override
	public String toString() {
		return "MyInteger{" +
				"num=" + num +
				'}';
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MyInteger myInteger = (MyInteger) o;
		return Objects.equals(num, myInteger.num);
	}

	@Override
	public int hashCode() {
		return Objects.hash(num);
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}



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


	public boolean str(int st) {
		int i = 0;
		char[] chars = ("" + st).toCharArray();
		for (i = chars.length - 1; i >= 0; --i) {
			System.out.print(chars[i] + " ");
		}


		return i < chars.length;
	}

	@Override
	public int compareTo(MyInteger o) {
		return rec(this.num).compareTo(rec(o.num));
	}
}