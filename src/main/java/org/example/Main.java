package org.example;

public class Main {
    public static void main(String[] args) {
        monThread t1 = new monThread();
        monThread t2 = new monThread();
        t1.start();
        t2.start();
    }
}