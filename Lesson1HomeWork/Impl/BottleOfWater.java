package Lesson1HomeWork.Impl;

import Lesson1HomeWork.Product;

import java.time.LocalDate;

public class BottleOfWater extends Product {
    private float volume;
    private String packaging;
    private boolean sparklingWater;

    public BottleOfWater(String name, double price, LocalDate releaseData) {
        super(name, price, releaseData);
        this.sparklingWater = false;
        this.packaging = Packaging.PLASTIC.getMaterial();
    }

    public BottleOfWater(String name,
                         double price,
                         LocalDate releaseData,
                         boolean sparklingWater,
                         String packaging,
                         float volume) {
        super(name, price, releaseData);
        this.sparklingWater = false;
        this.volume = volume;
        this.packaging = packaging;
    }

    public float getVolume() {
        return volume;
    }

    public String getPackaging() {
        return packaging;
    }

    public boolean isSparklingWater() {
        return sparklingWater;
    }

    @Override
    public String toString() {
        return STR."BottleOfWater{name='\{name}\{'\''}, price=\{price}, releaseData=\{releaseData}, volume=\{volume}, packaging='\{packaging}\{'\''}, sparklingWater=\{sparklingWater}\{'}'}";
    }
}
