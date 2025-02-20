package src.classes;

import src.exceptions.emptySalesException;

public class Sales extends emptySalesException {
private double totalPrice;
private Product[] products;

    public Sales() {
        super("Integer already added.");
    }

    public void doTotal() throws emptySalesException{
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
    }
}
