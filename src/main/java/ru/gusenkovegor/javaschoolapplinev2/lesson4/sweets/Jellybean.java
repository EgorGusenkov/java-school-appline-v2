package ru.gusenkovegor.javaschoolapplinev2.lesson4.sweets;

public class Jellybean extends Sweets {
    private String composition;

    public Jellybean(double weight, double price) {
        super(weight, price);
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    @Override
    public String getDescriptions() {
        return "composition=" + composition;
    }
}
