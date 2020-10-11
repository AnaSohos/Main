package com.example;

public class MapException extends Exception {

    public void print(String message) {
        System.err.println();
    }

    public MapException(String message) {
        super(message);
    }

    public MapException() {}
}