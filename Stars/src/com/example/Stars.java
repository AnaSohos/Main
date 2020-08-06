package com.example;

import java.util.Scanner;

public class Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("¬ведите  высоту,ширину рамки. ¬ведите слово.");
		Scanner scan = new Scanner(System.in);
		int height = scan.nextInt();
		int width = scan.nextInt();
		String a = scan.nextLine();
		int len = a.length();

		if (len > width) {
			System.out.print("ќшибка");

		}else {
			
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					if (i != 0 & i != height - 1 & j != 0 & j != width - 1) {
						System.out.print(' ');

					} else {
						System.out.print('*');
					}
				}
				System.out.println();
			}
			
		}
	
	
	}
	
	

}
