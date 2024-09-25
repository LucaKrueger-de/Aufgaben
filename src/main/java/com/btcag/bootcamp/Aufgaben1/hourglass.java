package com.btcag.bootcamp.Aufgaben1;

import java.util.Scanner;

public class hourglass {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        System.out.println("Geben sie ein wie groß die Sanduhr sein soll");
        int number = readIn.nextInt();
        char stern = 42;
        int i = number;
        while (i > 0) {
            int j = i;
            while (j > 0) {
                System.out.print(stern);
                j--;
            }
            System.out.println();
            i--;
        }
        System.out.println();
        while (i < number) {
            int j = 0;
            while (j <= i) {
                System.out.print(stern);
                j++;
            }
            System.out.println();
            i++;
        }
    }

}



