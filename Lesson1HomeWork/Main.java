package Lesson1HomeWork;

import Lesson1HomeWork.Impl.*;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product bottle1 = new
                BottleOfWater("Святой Источник", 56,
                LocalDate.of(2024, 6, 10));

        Product bottle2 = new
                BottleOfWater("Святой Источник Газированный", 56,
                LocalDate.of(2024, 6, 10),
                true,
                Packaging.GLASS.getMaterial(),
                0.5F);

        Product coffee = new HotDrink("Кофе", 100, LocalDate.of(2024, 6, 2), 80, 0.3F);

        Product tea = new HotDrink("Чай", 50, LocalDate.of(2024, 7, 2), 85, 0.3F);

        VendingMachine water = new WaterVendingMachine();

        VendingMachine hotDrinks = new HotDrinksVendingMachine();

//        System.out.println(water.getProducts());
//        water.addProducts(List.of(bottle1));
//        System.out.println(water.getProducts());
//        water.getProduct("Святой Источник Газированный");
//        System.out.println(water.getProducts());

        hotDrinks.addProducts(List.of(coffee,tea));
        System.out.println(hotDrinks.getProducts());
        hotDrinks.getProduct("Чай",0.3F,85);
        System.out.println(hotDrinks.getProducts());
    }
}
