package Lesson1HomeWork;

import java.time.LocalDate;

public class Product {
    protected String name;
    protected double price;
    protected LocalDate releaseData;
    private double temperature;

    private float volume;

    public Product(String name, double price, LocalDate releaseData) {
        this.name = name;
        this.price = price;
        this.releaseData = releaseData;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getReleaseData() {
        return releaseData;
    }

    public double getTemperature() {
        return temperature;
    }

    public float getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return STR."Product{name='\{name}\{'\''}, price=\{price}, releaseData=\{releaseData}\{'}'}";
    }
}
