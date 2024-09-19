package com.btcag.bootcamp;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {


        //Aufgabe a)

        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein die größer als 0 ist:");
        int zahl = input.nextInt();
        char stern = 42;
        int a = 0;
        int b;


        while (a < zahl) {
            a++;
            b = 0;
            System.out.println();
            while (b < 3) {
                System.out.print(stern);
                b++;
            }
        }

        //Aufgabe b)
        System.out.println();
        System.out.print("Gib die Größe eines Dreiecks an: ");
        int inputdrei = input.nextInt();
        int zahl1 = 0;
        int zahl2;

        while (zahl1 < inputdrei) {
            zahl1++;

            zahl2 = 0;
            System.out.println();
            while (zahl2 < zahl1) {
                System.out.print(stern);
                zahl2++;
            }


        }


        //Aufgabe c)

        System.out.println("Gib die Größe eines Dreiecks an: ");  //Noch ein Fehler drin. Nur die untere Seite der Sanduhr wird ausgegeben!
        int inputdrei1 = input.nextInt();
        int zahl11 = 0;
        int zahl22;

        while (zahl11 < inputdrei1) {
            zahl11++;

            zahl22 = 0;
            System.out.println();
            while (zahl22 < zahl11) {
                System.out.print(stern);
                zahl22++;
            }
        }

            while (zahl11 > inputdrei1) {

                zahl22 = 0;
                while (zahl22 < zahl11) {
                    System.out.print(stern);
                    zahl22++;
                }
                System.out.println();


            }

    }
}







