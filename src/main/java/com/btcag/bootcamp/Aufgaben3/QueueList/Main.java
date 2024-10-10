package com.btcag.bootcamp.Aufgaben3.QueueList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QueueList queueList = new QueueList();
        Scanner readIn = new Scanner(System.in);
        int input = 0;

        while (input != 6) {
            System.out.println("""
                    Welchen Schritt willst du machen?
                    (1) Gibt das erste Element zurück und löscht dieses von den Daten
                    (2) Gibt das letzte Element zurück und löscht dieses von den Daten
                    (3) Fügt das Objekt den Daten am Ende zu
                    (4) Fügt das Objekt den Daten am Anfang zu
                    (5) Gibt an Stelle i das Objekt zurück, entfernt es aber nicht
                    (6) Beendet Programm""");


            input = readIn.nextInt();
            int userInput;

            if (input == 1) {
                System.out.println("Das Element " + queueList.popFront() + " wurde gelöscht");
                queueList.printQueueList();
            } else if (input == 2) {
                System.out.println("Das Element " + queueList.popLast() + " wurde gelöscht");
                queueList.printQueueList();
            } else if (input == 3) {
                userInput = readIn.nextInt();
                System.out.println("Das Element " + queueList.pushLast(userInput) + "wurde am Ende hinzugefügt");
                queueList.printQueueList();
            } else if (input == 4) {
                userInput = readIn.nextInt();
                System.out.println("Das Element " + queueList.pushFront(userInput) + " wurde am Anfang hinzugefügt");
                queueList.printQueueList();
            } else if (input == 5) {
                userInput = readIn.nextInt();
                System.out.println("Das Element " + queueList.get(userInput) + " ist nun an der Stelle " + input);
                queueList.printQueueList();
            } else if (input == 6) {
                System.out.println("Programm wird beendet");
            } else {
                System.out.println("Ungültige Zahl");
            }
        }
    }
}