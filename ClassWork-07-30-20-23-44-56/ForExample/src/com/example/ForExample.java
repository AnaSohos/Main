package com.example;

import java.util.Random;
import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		var random = new Random().nextInt(10); // [0;10)
		
		var scanner = new Scanner(System.in);
		var number = scanner.nextInt();
		
		for (;number<10;) {
			System.out.println(number);
			number = number + 1;
		}
		
		while (number != random) {
			if (number > random) {
				System.out.println("Число больше");
			}
			else {
				System.out.println("Число меньше");
			}
			number = scanner.nextInt();
		}
		System.out.println("Вы угадали");

	}

}
