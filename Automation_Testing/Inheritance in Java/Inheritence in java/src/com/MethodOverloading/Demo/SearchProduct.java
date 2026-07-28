package com.MethodOverloading.Demo;

public class SearchProduct {
    public static Search(String productName) {
    	System.out.println("Saerching by Product Nmae");
    }
    public void search(String productName,String brand) {
    	System.out.println("Searching by Product and Brand");
    }
    public void search(String productName,String brand,int price) {
    	System.out.println("Searching by product,brand and price");
    }
    public static void main(String[]args) {
    	SearchProduct s=new SearchProduct();
    	s.search("Laptop");
    	s.search("Laptop","Macbook pro");
        s.search("Laptop", "Lenevo",60000);
    }
}

