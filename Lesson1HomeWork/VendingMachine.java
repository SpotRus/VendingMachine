package Lesson1HomeWork;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                return product;
            }
        }
        System.out.println(STR."Не найден продукт: \{name}");
        return null;
    }

    public Product getProduct(String name, float volume, double temp) {
        for (Product product : products) {
            if (product.getName().equals(name) && product.getVolume() == volume && product.getTemperature() == temp) {
                products.remove(product);
                return product;
            }
        }
        System.out.println(STR."Не найден продукт: \{name}");
        return null;
    }

    public List<Product> getProducts() {
        return products;
    }
}
