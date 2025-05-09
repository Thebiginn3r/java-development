package com.plurasight;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;

public class StoreApp {
    public static void main(String[] args) {
        String fileName = "inventory.csv";
        List<Product> inventory = getInventory();
        for(Product product : inventory) {
            System.out.println(product);
        }
    }
    public static List<Product> getInventory() {
        List<Product> inventory = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("inventory.csv"));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);
                inventory.add(new Product(id, name, price));

                //Product product = new Product
            }

            //return inventory;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

   /* public static void listAllProducts(List<Product> productList) {
        System.out.println("We carry the following inventory: ");
        for (Product product : productList) {
            System.out.println(product);

        }*/
        return inventory;
    }
}
