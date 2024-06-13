package Lesson1HomeWork.Impl;

public enum Packaging {
    PLASTIC("Пластик"), GLASS("Стекло"), ALUMINUM("Алюминий");

    private final String material;

    Packaging(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
