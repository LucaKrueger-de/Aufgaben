package com.btcag.bootcamp.Aufgaben2;

import java.util.Scanner;

public class VierGewinnt {
    public static Scanner readIn = new Scanner(System.in);
    public static char[] playerSymbol = {'X', 'O'};
    public static String[] playerNames = {userName1(), username2()};
    static int fieldHeight = 6;
    static int fieldWidth = 7;
    public static int[][] field = new int[fieldHeight][fieldWidth];

    //---------------------------------------------------Spielernamen abfragen:----------------------------------------
    public static String userName1() {

        String userNameOne;
        do {
            System.out.println("Spieler 1 Bitte geben Sie einen Benutzernamen ein: ");
            userNameOne = readIn.nextLine();
        } while (userNameOne.length() < 3 || userNameOne.length() > 15);
        return userNameOne;
    }

    public static String username2() {
        String userNameTwo;
        do {
            System.out.println("Spieler 2 Bitte geben Sie einen Benutzernamen ein: ");
            userNameTwo = readIn.nextLine();
        } while (userNameTwo.length() < 3 || userNameTwo.length() > 15);


        return userNameTwo;
    }

    //---------------------------------------------------------Sielfeld zeichnen:-------------------------------------------
    public static void drawField() {
        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < 7; k++) {

                System.out.print("[   ]");
            }
            System.out.println();
        }
    }

    //-------------------------------------------------------Spielzüge:-----------------------------------------------------

    public static void turn(String username1, String username2) {
        System.out.println("\n\n\n");
        boolean isPlayerOneTurn = true;

        while (true) {
            printField(field, fieldWidth, fieldHeight, playerSymbol);

            if (isPlayerOneTurn) {
                System.out.println(username1 + ", wo willst du deinen Chip setzen?");
            } else {
                System.out.println(username2 + ", wo willst du deinen Chip setzen?");
            }

            System.out.print("X-Koordinate (0-" + (fieldWidth - 1) + "): ");
            int newX = readIn.nextInt();

            if (newX < 0 || newX >= fieldWidth) {
                System.out.println("Ungültige Koordinate. Bitte versuche es erneut.");
                continue;
            }

            int player;
            if (isPlayerOneTurn) {
                player = 1;
            } else {
                player = 2;
            }
            int placedRow = placeChip(field, newX, player);

            if (placedRow == -1) {
                System.out.println("Diese Spalte ist voll. Wähle eine andere Spalte.");
                continue;
            }

            isPlayerOneTurn = !isPlayerOneTurn;
        }
    }

    public static void printField(int[][] field, int fieldWidth, int fieldHeight, char[] playerSymbol) {
        for (int i = 0; i < fieldHeight; i++) {
            for (int j = 0; j < fieldWidth; j++) {
                if (field[i][j] == 1) {
                    System.out.print("[ " + playerSymbol[0] + " ]");
                } else if (field[i][j] == 2) {
                    System.out.print("[ " + playerSymbol[1] + " ]");
                } else {
                    System.out.print("[   ]");
                }
            }
            System.out.println();
        }
    }

    public static int placeChip(int[][] field, int x, int player) {
        for (int i = field.length - 1; i >= 0; i--) {
            if (field[i][x] == 0) {
                field[i][x] = player;
                return i;
            }
            if (checkWin(field, 1)) {
                System.out.println(playerNames[0] + " hat gewonnen!");
                System.exit(0);
            } else if (checkWin(field, 2)) {
                System.out.println(playerNames[1] + " hat gewonnen!");
                System.exit(0);
            }

        }


        return -1;
    }


    //-----------------------------------------------------CheckWin:--------------------------------------------------------
    public static boolean checkWin(int[][] field, int player) {
        int height = field.length;
        int width = field[0].length;

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width - 3; col++) {
                if (field[row][col] == player && field[row][col + 1] == player &&
                        field[row][col + 2] == player && field[row][col + 3] == player) {
                    return true;
                }
            }
        }

        for (int col = 0; col < width; col++) {
            for (int row = 0; row < height - 3; row++) {
                if (field[row][col] == player && field[row + 1][col] == player &&
                        field[row + 2][col] == player && field[row + 3][col] == player) {
                    return true;
                }
            }
        }

        for (int row = 0; row < height - 3; row++) {
            for (int col = 0; col < width - 3; col++) {
                if (field[row][col] == player && field[row + 1][col + 1] == player &&
                        field[row + 2][col + 2] == player && field[row + 3][col + 3] == player) {
                    return true;
                }
            }
        }

        for (int row = 0; row < height - 3; row++) {
            for (int col = 3; col < width; col++) {
                if (field[row][col] == player && field[row + 1][col - 1] == player &&
                        field[row + 2][col - 2] == player && field[row + 3][col - 3] == player) {
                    return true;
                }
            }
        }
        return false;
    }

    //-----------------------------------------------------Mainspiel:--------------------------------------------------------
    public static void main(String[] args) {
        System.out.println(playerSymbol[0] + " " + playerNames[0] + "---------------------" + playerNames[1] + " " + playerSymbol[1]);
        drawField();
        turn(playerNames[0], playerNames[1]);

    }

}



