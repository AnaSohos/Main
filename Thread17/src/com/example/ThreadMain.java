package com.example;

public class ThreadMain {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <= 20; i++) {
            int elem = i;

            var th = new Thread() {
                public void run() {
                    System.out.println(" Деталь №" + elem + " обрабатывается  потоком - 1 ");
                }
            };

            var th2 = new Thread() {
                public void run() {
                    System.out.println(" Деталь №" + elem + " обрабатывается  потоком - 2 ");
                }
            };

            final
            var th3 = new Thread() {
                public void run() {
                    System.out.println(" Деталь №" + elem + " обрабатывается  потоком - 3 ");
                }
            };

            final
            var th4 = new Thread() {
                public void run() {
                    System.out.println(" Деталь №" + elem + " обрабатывается  потоком - 4 ");
                }
            };

            final
            var th5 = new Thread() {
                public void run() {
                    System.out.println(" Деталь №" + elem + " обрабатывается  потоком - 5 ");
                }
            };

            final
            var th6 = new Thread() {
                public void run() {
                    System.out.println(" Деталь №" + elem + " обрабатывается  потоком - 6 ");
                }
            };
            System.out.println("1 и 2 поток обрабатывает деталь синхронно");
            th.start();
            th2.start();
            th.join();
            th2.join();
            System.out.println("3 поток обрабатывает деталь асинхронно ");
            th3.start();
            th3.join();
            System.out.println(" 4 и 5 поток обрабатывает деталь синхронно");
            th4.start();
            th5.start();
            th4.join();
            th5.join();
            System.out.println("Включается 6 поток и обрабатывает деталь");
            th6.start();

        }
    }

}