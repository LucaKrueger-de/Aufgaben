package com.btcag.bootcamp.Aufgaben2;

import java.util.Scanner;

public class QuadratischeGleichungen {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        System.out.println("Geben Sie einen Wert für [a] ein: ");
        double a = readIn.nextDouble();
        System.out.println("Geben Sie einen Wert für [b] ein: ");
        double b = readIn.nextDouble();
        System.out.println("Geben Sie einen Wert für [c] ein: ");
        double c = readIn.nextDouble();

        double diskriminante = (b*b) - 4 * a * c;


        if (diskriminante > 0){
            System.out.println("Die quadratische Gleichung hat zwei Lösungen, weil die Parabel die x-Achse an zwei Punkten schneidet. Ergebnis:"+diskriminante);
        } else if (diskriminante == 0) {
            System.out.print("Die quadratische Gleichung hat eine Lösung, weil die Parabel die x-Achse genau in einem Punkt berührt. Ergebnis:"+diskriminante);


        }else {
            System.out.println("Die quadratische Gleichung hat keine Lösung im Bereich der reellen Zahlen, weil die Parabel die x-Achse nicht schneidet. Ergebnis:"+diskriminante);
        }

    }

}
