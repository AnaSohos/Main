package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatorZero {

	public static void main(String[] args) {
		int c, d, f, g, pr;
		double gh;

		System.out.println("Введите операцию (+ - * / ^) и два целый числа");
		Scanner scan = new Scanner(System.in);
		char oper = scan.next().charAt(0);
		int a = scan.nextInt();
		int b = scan.nextInt();

		if (a < 0 || b < 0) {
			System.out.println("Число меньше нуля. Попробуйте еще раз");
		}

		else {

			if (oper == '+') {
				c = a + b;
				System.out.println(" Сумма чисел = " + c);
			} 
			else if (oper == '-') {
				d = a - b;
				System.out.println("Разность чисел = " + d);
			} 
			else if (oper == '*') {
				f = a * b;
				System.out.println("Произведение чисел = " + f);
			} 
			else if (oper == '^') {
				int step = 1;
				for (int i = 1; i <= b; i++) {
					step = step * a;
				}
				System.out.println("Возведение в степень  = " + step);
			} 
			else if (oper == '/' && b != 0) {
				g = a / b;
				gh = (double) a / b;
				pr = a % b;
				System.out.println(" Дробное = " + gh + " Частное чисел = " + g + "Остаток от деления = " + pr);

			} 
			else {
				System.out.println("Ошибка!! Попробуйте еще раз!");
			}

		}

	}

}
