package com.btcag.bootcamp.Aufgaben1;

import java.util.Scanner;

public class geometry {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Geben Sie eine Zahl ein, die größer als 0 ist: ");
         double zahl = input.nextDouble();
         double ergebnis = 3.14 * Math.sqrt(zahl);

         System.out.println("Kreisfläche:"+ ergebnis + "cm^2"); //Fläche für Kreis berechnet

         Scanner input1 = new Scanner (System.in);
        Scanner input2 = new Scanner (System.in);
         System.out.println("Geben Sie die Höhe ein: ");
        double höhe = input1.nextDouble();
         System.out.println("Geben Sie die Breite ein: ");
        double breite = input2.nextDouble();


         double fläche = breite * höhe;

         System.out.println("Die Fläche des Rechteckes beträgt "+ fläche+"cm^2"); // Fläche für Rechteck berechnet

    }
}

