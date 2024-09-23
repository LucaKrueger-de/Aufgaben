package com.btcag.bootcamp;

import java.util.Scanner;

public class supermarket {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        double price = 1;
        double summe = 0;

        while (price != 0) {
            System.out.println("Bitte alle Produkte in Cent eingeben und mit -(0)- die Liste beenden: ");
            price = readIn.nextDouble();
            summe += price;
        }
        System.out.println("Die Summe aller Produkte ist " + summe + " €");

        System.out.println("Wieviel hat der Kunde gegeben (in Cent)? ");
        double cents = readIn.nextDouble();
        double change = cents - summe;

        System.out.println("Wechselgeld " + change/100 + " €");

        double[] banknote = {
                50000,
                20000,
                10000,
                5000,
                2000,
                1000,
                500,
                200,
                100,
                50,
                20,
                10,
                5,
                2,
                1
        };
        int i = 0;
        while (change > 0 && i < banknote.length) {
            if (change >= banknote[i]) {
                int anzahl = (int) (change / banknote[i]);
                change = change - (anzahl * banknote[i]);
                System.out.println(anzahl + "x " + (banknote[i] / 100) + "€");
            }
            i++;


        }
    }
}