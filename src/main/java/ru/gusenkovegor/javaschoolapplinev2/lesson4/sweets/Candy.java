package ru.gusenkovegor.javaschoolapplinev2.lesson4.sweets;

public class Candy extends Sweets {
    private String countryOfOrigin;

    public Candy(double weight, double price) {
        super(weight, price);
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String getDescriptions() {
        return "country of origin=" + countryOfOrigin;
    }
}
