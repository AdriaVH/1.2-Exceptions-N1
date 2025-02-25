package classes;

import exceptions.emptySalesException;
import java.util.ArrayList;
import java.util.List;

public class Sale extends emptySalesException {
    private double totalPrice;
    private List<Product> products = new ArrayList<>();

    public Sale(Product product) {
    addProduct(product);
    }
    public Sale(){
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void doTotal() throws emptySalesException{
        if (products.isEmpty()){
            throw new emptySalesException("To sell you first have to add some products");
        } else {
            totalPrice = 0;
            for (Product product : products) {
                totalPrice += product.getPrice();
            }
        }
    }
    public void addProduct (Product product){
        products.add(product);
    }
    public void deleteProduct(Product product){
        products.remove(product);
    }
}
