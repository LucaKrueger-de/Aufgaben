package com.btcag.bootcamp.Aufgaben2;

import java.util.Scanner;

public class Schaltjahre {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        System.out.println("Geben Sie eine Jahreszahl ein ");
        int year = readIn.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " ist ein Schaltjahr");
        } else {
            System.out.println(year + " ist kein Schaltjahr");
        }


    }
}
