package com.ecommerce.search;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(103, "Keyboard", "Electronics"),
            new Product(101, "Shampoo", "Personal Care"),
            new Product(105, "Notebook", "Stationery"),
            new Product(102, "Mouse", "Electronics"),
        };

        // Linear Search
        System.out.println("Linear Search for ID 105:");
        Product result1 = SearchUtility.linearSearch(products, 105);
        System.out.println(result1 != null ? result1 : "Product not found");

        // Binary Search
        SearchUtility.sortProductsById(products); // Needed before binary search
        System.out.println("\nBinary Search for ID 101:");
        Product result2 = SearchUtility.binarySearch(products, 101);
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}