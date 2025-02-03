package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) throws Exception {
        // on construit un sémaphore initialisé à 1
        Semaphore s = new Semaphore(0);
        int n = 10;
        for (int i = 0; i < n; i++) {
            RendezVous r = new RendezVous(n, s);
            r.start();
        }
    }
}
