package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        List<String> produits = new ArrayList<>();
        // on remplit la liste
        for (int i = 0; i < 10; i++) {
            produits.add("numéro " + i);
        }
        Consomateur cons = new Consomateur(produits);
        cons.start();
    }
}
