package org.example;

public class monThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
// la méthode getName() renvoie le nom du thread
            System.out.println("coucou de la part du thread " + getName());
        }
    }
}