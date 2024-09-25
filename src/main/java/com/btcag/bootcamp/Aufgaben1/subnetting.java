package com.btcag.bootcamp.Aufgaben1;

import java.util.Scanner;

public class subnetting {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        int i = 0;

        System.out.println("Bitte gebe das erste Oktett der ip adresse an: ");
        long oktett1 = readIn.nextLong();

        System.out.println("Bitte gebe das zweite Oktett der ip adresse an: ");
        long oktett2 = readIn.nextLong();
        System.out.println("Bitte gebe das dritte Oktett der ip adresse an: ");
        long oktett3 = readIn.nextLong();
        System.out.println("Bitte gebe das vierte Oktett der ip adresse an: ");
        long oktett4 = readIn.nextLong();
        System.out.println("Bitte gebe die Subnetze an: ");
        long subnetz = readIn.nextLong();

        System.out.println("Die Netzwerkadresse ist: "+oktett1+"."+oktett2+"."+oktett3+"."+oktett4+ """
                """);




    }
}
