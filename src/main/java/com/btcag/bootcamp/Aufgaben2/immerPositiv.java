package com.btcag.bootcamp.Aufgaben2;

import java.util.Scanner;

public class immerPositiv {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein: ");
        int number = readIn.nextInt();

        if (number < 0) {
            int p = number * -1;
            System.out.println(number + " --> " + p);
        } else {
            System.out.println(number + " --> " + number);
        }

    }
}
