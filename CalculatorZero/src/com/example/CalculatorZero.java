package com.example;

import java.util.Scanner;

public class CalculatorZero {

    public static void main(String[] args) {
        int result = 0, rest, quotient;
        double quotie;

        System.out.println("Введите операцию (+ - * / ^) и два целый числа");
        Scanner scan = new Scanner(System.in);
        char oper = scan.next().charAt(0);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if (oper == '+') {
            result = num1 + num2;
            System.out.println(" Сумма чисел = " + result);

        } else if (oper == '-') {
            result = num1 - num2;
            System.out.println("Разность чисел = " + result);
        } else if (oper == '*') {
            result = num1 * num2;
            System.out.println("Произведение чисел = " + result);
        } else if (oper == '^') {
            int step = 1;
            for (int i = 1; i <= num2; i++) {
                step = step * num1;
            }

            if (step < 0) {
                step *= -1;
            }
            System.out.println("Возведение в степень  = " + step);
        } else if (oper == '/' && num2 != 0) {
            quotient = num1 / num2;
            quotie = (double) num1 / num2;
            rest = num1 % num2;
            System.out
                .println(" Дробное = " + quotie + " Частное чисел = " + quotient + " Остаток от деления = " + rest);

        } else {
            System.out.println("Ошибка!! Попробуйте еще раз!");
        }

    }
}