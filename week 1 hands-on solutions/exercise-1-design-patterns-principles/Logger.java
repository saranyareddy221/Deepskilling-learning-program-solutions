package com.example.singleton;

public class Logger {
    private static Logger instance;

    // Private Constructor to limit instantiation
    private Logger() {
        System.out.println("Logger instance created");
    }

    // Synchronizes access to the single logger instance
    public static synchronized Logger getInstance() {

        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

