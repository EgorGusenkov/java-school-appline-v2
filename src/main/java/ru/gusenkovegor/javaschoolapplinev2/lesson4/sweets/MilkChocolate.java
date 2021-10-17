package ru.gusenkovegor.javaschoolapplinev2.lesson4.sweets;

public class MilkChocolate extends Sweets {
    private int percentageOfCocoa;

    public MilkChocolate(double weight, double price) {
        super(weight, price);
    }

    public int getPercentageOfCocoa() {
        return percentageOfCocoa;
    }

    public void setPercentageOfCocoa(int percentageOfCocoa) {
        this.percentageOfCocoa = percentageOfCocoa;
    }

    @Override
    public String getDescriptions() {
        return "percentage of cocoa=" + percentageOfCocoa;
    }
}
