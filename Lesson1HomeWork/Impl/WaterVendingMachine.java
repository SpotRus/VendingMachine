package Lesson1HomeWork.Impl;

import Lesson1HomeWork.Product;
import Lesson1HomeWork.VendingMachine;

import java.util.List;

public class WaterVendingMachine extends VendingMachine {
    public WaterVendingMachine() {
        super();
    }

    public WaterVendingMachine(List<Product> products) {

        super(products);
    }
}
