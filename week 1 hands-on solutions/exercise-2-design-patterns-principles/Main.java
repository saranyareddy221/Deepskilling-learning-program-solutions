package com.example.factory;

public class Main {

    public static void main(String[] args) {
        
        // Word Document
        DocumentFactory wordFactory = new WordFactory();
        Document wordDoc = wordFactory.createDocument();

        wordDoc.open();

        // PDF document
        DocumentFactory pdfFactory = new PdfFactory();
        Document pdfDoc = pdfFactory.createDocument();

        pdfDoc.open();

        // Excel document
        DocumentFactory excelFactory = new ExcelFactory();
        Document excelDoc = excelFactory.createDocument();

        excelDoc.open();
    }

}

