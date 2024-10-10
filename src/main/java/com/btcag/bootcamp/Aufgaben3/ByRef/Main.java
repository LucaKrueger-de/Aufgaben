package com.btcag.bootcamp.Aufgaben3.ByRef;

import java.util.Scanner;

public class Main extends Calculation {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        System.out.println("Welche Zahl soll verdoppelt werden?");
        WertObjekt number = new WertObjekt(readIn.nextLong());
        System.out.println("Wie oft wollen Sie diese verdoppeln?");
        int factor = readIn.nextInt();

        while (factor > 0) {
            doubleValue(number);
            factor--;
        }
        System.out.println(number.value);
    }


}
