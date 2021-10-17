package ru.gusenkovegor.javaschoolapplinev2.lesson4.sweets;

public class WhiteChocolate extends Sweets {
    private int calorie;

    public WhiteChocolate(double weight, double price) {
        super(weight, price);
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    @Override
    public String getDescriptions() {
        return "calorie=" + calorie;
    }
}
