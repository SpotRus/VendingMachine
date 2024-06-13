package Lesson1HomeWork.Impl;

import Lesson1HomeWork.Product;
import Lesson1HomeWork.VendingMachine;

import java.util.List;

public class HotDrinksVendingMachine extends VendingMachine {

    public HotDrinksVendingMachine() {
        super();
    }

    public HotDrinksVendingMachine(List<Product> products) {
        super(products);
    }
}
