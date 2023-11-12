package com.banking;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        long numCard = random.nextLong(0000_0000_0000_0000L, 9999_9999_9999_9999L);
        long numPin = random.nextLong(0000, 9999);


        while (true) {
            startMenu();
            int button = scanWaitInt();

            if (button == 1) {
                System.out.println();

                Card card = new Card(numCard, numPin);

                accountCreate(numCard, numPin);

            }

            if (button == 2) {
                System.out.println();
                System.out.println("Enter your card number:");
                System.out.print(">");
                long numCardClient = scanWaitLong();
                System.out.println("Enter your PIN:");
                System.out.print(">");
                int numPinClient = scanWaitInt();
                System.out.println(numPinClient);
                if (numPinClient == numPin && numCardClient == numCard) {
                    System.out.println();
                    System.out.println("You have successfully logged in!");
                    accountMenu();
                } else {
                    System.out.println("Wrong card number or PIN!");
                }

            }
            if (button == 0) {
                System.out.println();
                System.out.println("Bye!");
                return;
            }

        }
    }

    public static void startMenu() {
        System.out.println("1. Create an account");
        System.out.println("2. Log into account");
        System.out.println("0. Exit");
        System.out.print(">");

    }

    public static void accountMenu() {
        System.out.println();
        System.out.println("1. Balance");
        System.out.println("2. Log out");
        System.out.println("0. Exit");
        System.out.print(">");
        int log = scanWaitInt();
        if (log == 1) {
            System.out.println();
            System.out.println("Balance: 0");
            accountMenu();

        }
        if (log == 2) {
            System.out.println();
            System.out.println("You have successfully logged out!");
            System.out.println();

        }

    }

    public static int scanWaitInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }

    public static long scanWaitLong() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLong();

    }

    public static void accountCreate(long cardN, long numP) {
        System.out.println("Your card has been created");
        System.out.println("Your card number:");
        System.out.println("        " + cardN);
        System.out.println("Your card PIN:");
        System.out.println("        " + numP);
        System.out.println();

    }
}

/**
 * original
 */

//package banking;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello, world!");
//    }
//}