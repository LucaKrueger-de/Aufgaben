package com.btcag.bootcamp;

import java.util.Scanner;
import java.util.StringTokenizer;

public class fibonacci {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl n ein: ");
        int value = readIn.nextInt();  // Formel Fibonacci fn= fn-1 + fn-2
        int i = 0;
        int j= 1;

        System.out.print("Fibonacci Zahlen: "+ i);

        while (j<=value){
            System.out.print(", "+j);
                    int fibo= i+j;
                    i=j;
                    j=fibo;
        }

        }
    }
