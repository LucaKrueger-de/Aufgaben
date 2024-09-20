package com.btcag.bootcamp;

import java.util.Scanner;

public class großbuchstaben {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //einbelegtesbrotmitschinken
        String caps = input.nextLine();

        String output = "";

        char reconversion;
        int length = caps.length();
        int counter = 0;

        while (counter < length) {
            char currChar = caps.charAt(counter);
            int ascii = (int) currChar;
            while (ascii > 90) {
                ascii -= 32;
            }
            reconversion = (char) ascii;
            output = output + reconversion;
            counter++;
        }

        System.out.println(output);


    }
}
