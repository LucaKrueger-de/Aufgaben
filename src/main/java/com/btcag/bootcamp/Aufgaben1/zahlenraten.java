package com.btcag.bootcamp.Aufgaben1;

import java.util.Random;
import java.util.Scanner;

public class zahlenraten {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        Random random = new Random();

        int attempts = 1;
        long guessNumber = 0;

        System.out.println("Bitte gebe die Zahlengöße in Bits an: ");
        int inBit = readIn.nextInt();
        long bitShift = (long) 1 << inBit;
        long maxNumb = bitShift - 1;
        long randomNumb = random.nextLong(0, maxNumb);

        while (guessNumber != randomNumb) {
            System.out.println(attempts + ".Versuch: Bitte eine Zahl im Bereich 0 und " + maxNumb + " ein");
            guessNumber = readIn.nextInt();
            attempts++;
            if (guessNumber < randomNumb) {
                System.out.println("Die gesuchte Zahl ist größer! ");
            } else if (guessNumber > randomNumb) {
                System.out.println("Die gesuchte Zahl ist kleiner! ");

            } else {
                System.out.println("Super!");
            }

        }

    }
}
