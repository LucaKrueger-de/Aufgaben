package com.btcag.bootcamp.Aufgaben2;


import java.util.Scanner;

public class Sortieren {
    public static int[] sortieren(int[] numbers) {
        for (int i = numbers.length; i >= 0; i--) {
            for (int j = 0; j < 4; j++) {
                if (numbers[j] > numbers[(j + 1)]) {
                    int currNumb = numbers[j];
                    int nextNumb = numbers[(j + 1)];
                    numbers[j] = nextNumb;
                    numbers[(j + 1)] = currNumb;
                }
            }
        }
        return numbers;
    }


    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Gibt eine Ganzzahl ein");
            numbers[i] = readIn.nextInt();
            System.out.println();
        }
        sortieren(numbers);

        System.out.println("Der Größe nach geordnet:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }


    }
}
