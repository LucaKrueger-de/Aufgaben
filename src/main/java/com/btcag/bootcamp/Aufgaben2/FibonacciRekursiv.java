package com.btcag.bootcamp.Aufgaben2;

import java.util.Scanner;

public class FibonacciRekursiv {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;

        }
        if (n == 1) {
            return 1;

        }
        return fibonacci(n-1)+ fibonacci(n-2);
    }


    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      int number = input.nextInt();
      System.out.println("Die "+number+" Fibonacci-Zahl ist: "+fibonacci(number));
    }
}
