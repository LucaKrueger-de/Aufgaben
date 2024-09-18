package com.btcag.bootcamp;

import java.util.Scanner;

public class divisionscheck {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Geben Sie einen Divisor ein: ");
        int divisor = input.nextInt();
        System.out.println("Geben Sie eine maximale Zahl ein, bis wohin gerechnet werden soll: ");
        int maxzahl = input.nextInt();

        int zahl = 1;
        while (zahl <= maxzahl){
            if (zahl % divisor == 0) {
                System.out.println(zahl);
            }
        zahl++;




        }





    }
}
