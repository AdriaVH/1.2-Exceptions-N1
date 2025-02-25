package main;

import exceptions.emptySalesException;
import classes.*;

//Crea una classe anomenada "Producte" amb els atributs nom i preu, i una altra classe anomenada
// "Venda". Aquesta classe té com a atributs una col·lecció de productes i el preu total de la venda.
//
//La classe "Venda", té un mètode anomenat calcularTotal() que llança l’excepció personalitzada
// "VendaBuidaException" i mostra per pantalla “Per fer una venda primer has d’afegir productes”
// si la col·lecció de productes està buida. Si la col·lecció té productes, llavors ha de recórrer
// la col·lecció i guardar la suma de tots els preus dels productes a l’atribut preu total de la venda.
//
//L’excepció personalitzada "VendaBuidaException" ha de ser filla de la classe Exception. Al seu
// constructor li hem de passar el missatge  “Per fer una venda primer has d’afegir productes” i
// quan capturem l’excepció, l’hem de mostrar per pantalla amb el mètode getMessage() de l’excepció.
//
//Escriu el codi necessari per a generar i capturar una excepció de tipus "IndexOutOfBoundsException".

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

