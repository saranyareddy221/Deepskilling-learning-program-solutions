package com.example.factory;
public class ExcelDocument implements Document {
    public void open() {
        System.out.println("Excel Document opened.");
    }
}