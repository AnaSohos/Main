package com.example;

public class DetalsRan implements Runnable {
    Thread th;
    Thread th2;
    Thread th3;
    Thread th4;
    Thread th5;
    Thread th6;
    private String detal;

    DetalsRan(String detal) throws InterruptedException {
        this.detal = detal;
        th = new Thread(this);
        th2 = new Thread(this);
        th3 = new Thread(this);
        th4 = new Thread(this);
        th5 = new Thread(this);
        th6 = new Thread(this);

        th.start();
        th2.start();
        th.join();
        th2.join();
        System.out.println("Обрабатываю деталь! синхронно,  первый раз");

        th3.start();
        th3.join();
        System.out.println("Обрабатываю деталь! асинхронно, первый раз");

        th4.start();
        th5.start();
        th4.join();
        th5.join();
        System.out.println("Обрабатываю деталь! синхронно, второй раз");

        th6.start();
        th6.join();
        System.out.println("Обрабатываю деталь! асинхронно, второй раз");
    }


    public DetalsRan() {

    }

    public String getDetal() {
        return detal;
    }

    public void setDetal(String detal) {
        this.detal = detal;
    }

    public Thread getTh() {
        return th;
    }

    public void setTh(Thread th) {
        this.th = th;
    }

    @Override
    public void run() {
        System.out.println("Обрабатываю деталь №" + this.detal + "!");

        try {
            Thread.sleep(1_00);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();

        }

    }
}