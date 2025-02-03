package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) throws Exception {
        // on construit un sémaphore initialisé à 1
        Semaphore s = new Semaphore(1);
        List<String> produits = new ArrayList<>();
        // on remplit la liste
        for (int i = 0; i < 10; i++) {
            produits.add("numéro " + i);
        }
        Consomateur cons = new Consomateur(produits, s);
        Consomateur cons2 = new Consomateur(produits, s);

        cons.start();
        cons2.start();
    }
}
