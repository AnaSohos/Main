package com.example;

import java.io.PrintStream;

public class MyException extends Exception {

    public void print(String message) {
        System.err.println();
    }

    public MyException(String message) {
        super(message);
    }

    public MyException() {}
}