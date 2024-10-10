package com.btcag.bootcamp.Aufgaben3.QueueList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QueueList queueList = new QueueList();
        Scanner readIn = new Scanner(System.in);

        System.out.println("""
                  Welchen Schritt willst du machen?
                  (1) Gibt das erste Element zurück
                  (2) Gibt das letzte Element zurück
                  (3) Fügt das Objekt den Daten am Ende zu
                  (4) Fügt das Objekt den Daten am Anfang zu
                  (5) Gibt an Stelle i das Objekt zurück, entfernt es aber nicht""");

    }
}
