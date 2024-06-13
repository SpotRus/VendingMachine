package Lesson1HomeWork.Impl;

import Lesson1HomeWork.Product;

import java.time.LocalDate;

public class HotDrink extends Product {

    private double temperature;

    private float volume;

    public HotDrink(String name, double price, LocalDate releaseData) {
        super(name, price, releaseData);
    }

    public HotDrink(String name, double price, LocalDate releaseData, double temperature, float volume) {
        super(name, price, releaseData);
        this.temperature = temperature;
        this.volume = volume;
    }

    public double getTemperature() {
        return temperature;
    }

    public float getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return STR."HotDrink{, name='\{name}\{'\''},temperature=\{temperature}, volume=\{volume}\{'}'}";
    }
}
