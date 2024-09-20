package com.btcag.bootcamp;

import java.util.Scanner;

public class kryptischezahlen {
    public static void main(String[] args) {
        Scanner readIn = new Scanner (System.in);

        System.out.println("Bitte die Zahl eingeben: ");
        long numb = readIn.nextInt();

        System.out.println("Bitte Passwort (Zahl) eingeben: ");
        long pw = readIn.nextInt();

        long krypt = numb ^pw;
        System.out.println(krypt);

        //Umkehrung von Kryptischer Zahl zur Ausgangszahl

        System.out.println("Bitte die Zahl eingeben: ");
        long krypt2 = readIn.nextInt();

        System.out.println("Bitte Passwort (Zahl) eingeben: ");
        long pw2= readIn.nextInt();

        long result = krypt2 ^pw2;
        System.out.println(result);


    }
}
