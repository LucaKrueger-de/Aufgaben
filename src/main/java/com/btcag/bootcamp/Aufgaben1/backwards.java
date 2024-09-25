
package com.btcag.bootcamp.Aufgaben1;

import java.util.Scanner;

public class backwards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahl eingeben:");
                long input = scanner.nextLong();

        long reverse = 0;
        while (input !=0){
            reverse = reverse * 10 + input % 10;
            input = input/10;
        }

        System.out.println("Umgekehrte Eingabe: " + reverse);
    }
}









