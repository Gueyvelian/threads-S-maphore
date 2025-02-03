package org.example;

import java.util.List;
import java.util.concurrent.Semaphore;

public class Consomateur extends monThread {
    List<String> produits;
    Semaphore semaphore;

    public Consomateur(List<String> produits, Semaphore s) {
        this.produits = produits;
        this.semaphore = s;
    }

    @Override
    public void run() {
        while (true) {
            try {

                semaphore.acquire(); // down du sémaphore
            } catch (InterruptedException ex) {}
            // début section critique
            if (produits.isEmpty()) {semaphore.release();break;}
            int last = produits.size() - 1;
            System.out.println(getName() + "tente de lire le produit :" + last);
            String produit = produits.get(last);
            System.out.println(getName() + " a lu le produit : " + produit);
            System.out.println(getName() + " tente d'enlever le produit : " + produit);
            produits.remove(last);
            // sortie de la section critique
            semaphore.release(); // up du sémaphore
            System.out.println(getName() + " a enlevé le produit : " + produit);
        }
        System.out.println(getName() + " a fini");
    }
}