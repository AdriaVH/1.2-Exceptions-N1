package main;

import exceptions.emptySalesException;
import classes.*;
public class main {
    public static void main(String[] args) {
        Sale sale1 = new Sale();
        try {
            sale1.doTotal();
        } catch (emptySalesException | IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        try {
            Product product1 = new Product("water", 0.99);
            Product product2 = new Product("orangeJuice", 2.99);

            sale1.addProduct(product1);
            sale1.doTotal();
            System.out.println(sale1.getTotalPrice());
            sale1.addProduct(product2);
            sale1.doTotal();
            System.out.println(sale1.getTotalPrice());

        } catch (emptySalesException e) {
            System.out.println(e.getMessage());
        }
    }
}

