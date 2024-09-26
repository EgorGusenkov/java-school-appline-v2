package ru.gusenkovegor.javaschoolapplinev2.lesson4.sweets;

public abstract class Sweets {
    private final double weight;
    private final double price;

    public Sweets(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getDescriptions();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                ", weight=" + weight +
                ", price=" + price +
                ", " + getDescriptions();
    }
}
