package com.btcag.bootcamp.Aufgaben1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahl eingeben zur Quadratzahlberechnung");
        long thenumber = scanner.nextLong();
        thenumber *= thenumber;
        System.out.println("Ergebnis:"+ thenumber);
    }
}