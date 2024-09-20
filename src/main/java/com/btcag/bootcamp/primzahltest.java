package com.btcag.bootcamp;

import java.util.Scanner;

public class primzahltest {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein: ");
        int numb = readIn.nextInt();
        int divisor = 2;
        boolean prim = numb > 1;

        while (prim && divisor <= numb / 2) {
            prim = (numb % divisor != 0);
            divisor++;

        }
        while (!prim) {
            System.out.println(numb + " ist keine Primzahl!");
            return;
        }
        while (prim) {
            System.out.println(numb + " ist eine Primzahl :)");
            return;
        }
    }
}



