package org.example;

import java.util.List;

public class Consomateur extends monThread {
    List<String> produits;
    public Consomateur(List<String> produits) {
        this.produits = produits;
    }
    @Override
    public void run() {
        while (true) {
            if (produits.isEmpty()) break;
            int last = produits.size() - 1;
            System.out.println(getName() + "tente de lire le produit :" + last);
            String produit = produits.get(last);
            System.out.println(getName() + " a lu le produit : " + produit);
            System.out.println(getName() + " tente d'enlever le produit : " + produit);
            produits.remove(last);
            System.out.println(getName() + " a enlevé le produit : " + produit);
        }
        System.out.println(getName() + " a fini");
    }
}