package com.btcag.bootcamp;

import java.util.Scanner;

public class quersumme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben sie eine Zahl ");

        long number = scanner.nextLong();
        long result = 0;

        String numString = number + "";

        int length = numString.length();

        while (length > 0) {
            String stellenwert = String.valueOf(numString.charAt(length - 1));
            result += Long.parseLong(stellenwert);

            length--;
        }
        System.out.println("Die Quersumme ist: "+ result);
    }
}
