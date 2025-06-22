package com.example.singleton;
public class Main {
    public static void main(String[] args) {
        // First logger instance
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first message.");

        // Second logger instance
Logger logger2 = Logger.getInstance();
        logger2.log("This is the second message.");

        // Check if both instances are the same
        if (logger1 == logger2) {
            System.out.println("Same logger instance used (Singleton works).");
} else {
            System.out.println("Different instances found (Singleton failed).");
        }
    }
}