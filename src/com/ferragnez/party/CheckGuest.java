package com.ferragnez.party;

import java.util.Scanner; // Import the Scanner class

import javax.naming.InitialContext;

public class CheckGuest {
    public static void main(String[] args) {

        // Array di stringhe invitati inizializzato
        String[] Invitati = {
                "Leonardo DiCaprio",
                "Scarlett Johansson",
                "Johnny Depp",
                "Emma Watson",
                "Keanu Reeves",
                "Tom Cruise",
                "Angelina Jolie",
                "Robert Downey Jr.",
                "Brad Pitt",
                "Jennifer Lawrence" };

        // Faccio variabile oggetto di Scanner
        Scanner input = new Scanner(System.in);
        // Chiedo ad utente il suo nome e cognome e li metto in minuscolo
        String nome = input.nextLine().toLowerCase();
        String cognome = input.nextLine().toLowerCase();

        boolean InvitatoTrovato = false;
        String NomeInvitatoTrovato = "";

        for (int i = 0; i < Invitati.length; i++) {
            // Elemento corrente in minuscolo
            String currElement = Invitati[i].toLowerCase();

            if (currElement.equals(nome + " " + cognome) || currElement.equals(cognome + " " + nome)) {
                InvitatoTrovato = true;
                NomeInvitatoTrovato = Invitati[i];

                break;
            }

        }
        if (InvitatoTrovato)
            System.out.println("Prego " + NomeInvitatoTrovato + " puoi entrare.");
        else
            System.out.println("Torna a casa zio non sei nella lista");

        input.close();
    }
}
