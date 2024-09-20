package com.btcag.bootcamp;

import java.util.Scanner;

public class primfaktorzerlegung {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Anzahl der Iterationen ein: ");
        int numb = readIn.nextInt();

        double pi = 0;  //
        double counter = 4;  //
        double denominator  = 1;
        int i = 0;

        int vorzeichen = 1;

        while (i < numb) {
            pi = pi + vorzeichen * (counter / denominator );

            denominator  = denominator  + 2;

            vorzeichen = vorzeichen * -1;

            i = i + 1;
        }
        System.out.println("Nach " + numb + " Iterationen wurde Pi auf den Wert " + pi + " berechnet");

    }
}
