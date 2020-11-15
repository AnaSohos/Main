package com.example;

import java.util.Scanner;

public class CalculatorZero {

    public static void main(String[] args) {
        var result = 0;


        System.out.println("Введите операцию + - * / div ^ mod!");
        Scanner scan = new Scanner(System.in);
        var oper = scan.nextLine();


        while (!oper.equals("+") && !oper.equals("-") && !oper.equals("*") && !oper.equals("/") && !oper.equals("^") && !oper.equals("mod") && !oper.equals("div")) {
            System.out.println("Вы ввели некоректная операция, введите + - * / div ^ mod!");
            oper = scan.nextLine();
        }

        System.out.println("Введите два целый числа !");

        var num1 = scan.nextInt();
        var num2 = scan.nextInt();

        switch (oper) {
            case "+":
                result = num1 + num2;
                System.out.println(" Сумма чисел = " + result);
                break;

            case "-":
                result = num1 - num2;
                System.out.println("Разность чисел = " + result);
                break;

            case "*":
                result = num1 * num2;
                System.out.println("Произведение чисел = " + result);
                break;

            case "^":
                if (num2 > 0) {
                    var n = 1;
                    for (var i = 1; i <= num2; i++)
                        n = n * num1;
                    System.out.println("Возведение в степень = " + n);


                } else if (num2 < 0) {
                    var n = 1;
                    num2 *= -1;
                    for (var i = 1; i <= num2; i++)
                        n = n * num1;
                    System.out.println("Возведение в степень = " + 1 / (float) n);

                }
                break;



            case "/":
                if (num2 == 0) {
                    System.out.println("На ноль делить нельзя!");

                } else {
                    double quotie;
                    quotie = (double) num1 / num2;
                    System.out.println(" Результат дробного деления = " + quotie);
                }
                break;



            case "div":
                if (num2 == 0) {
                    System.out.println("На ноль делить нельзя!");

                } else {
                    result = num1 / num2;
                    System.out.println("Деление целых чисел = " + result);

                }
                break;

            case "mod":

                result = num1 % num2;
                System.out.println("Остаток от деления чисел = " + result);
                break;
        }


    }
}