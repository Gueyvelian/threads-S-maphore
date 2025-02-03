package org.example;

import java.util.concurrent.Semaphore;

public class RendezVous extends monThread {
    int n;
    Semaphore s;
    static int compteur = 0;
    public RendezVous(int n, Semaphore s) {
        this.n = n;
        this.s = s;
    }
    @Override
    public void run() {

        //metre un deuxieme semaphore pour protégé le premier
        //debut de semaphore (initialisé a 1)
        System.out.println(getName()+ "débute sa première partie");
        System.out.println(compteur);
        compteur = compteur + 1;
        if (compteur < n-1) {

            try {
                s.acquire(); // down du sémaphore
            }
            catch (InterruptedException ex) { }
        }
        //fin du deuxieme semaphore
        System.out.println(getName()+ "débute sa seconde partie");

        compteur = compteur - 1;
            if (compteur != 0){
                s.release(); // up du sémaphore
            }



    }
}

