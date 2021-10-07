package ru.gusenkovegor.javaschoolapplinev2.lesson4;

public enum Sweets {
    WHITE_CHOCOLATE(50, 50.00, "сахар, масло какао, плёночное сухе молоко и ванилин"),
    MILK_CHOCOLATE(55, 55.00, "сахар, масло какао, молоко сухое обезжиренное, какао тертое, сыворотка сухая молочная, жир молочный"),
    CANDY(35, 45.00, " финик, арахис, шоколад несладкий (какао-масло, какао-порошок), ароматизатор пищевой ванилин"),
    JELLYBEAN(15, 25.00, "сахар, глюкозный сироп, кукурузный крахмал, вода, фруктовый сок из концентрата (ананас, апельсин, яблоко), натуральные ароматизаторы, концентраты: моркови, тыквы, яблоки, спирулины, редиса, черной смородины, гибискуса), кислоты (яблочная, лимонная, фумаровая), глазурь агенты (шеллак, карнаубский воск, пчелиный воск), карамелизированный сахар, регулятор кислотности (содиум цитирует), кокосовое масло");

    double weight;
    double price;
    String composition;

    Sweets(double weight, double price, String composition) {
        this.weight = weight;
        this.price = price;
        this.composition = composition;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    @Override
    public String toString() {
        return this.name() +
                "{" +
                "weight=" + weight +
                ", price=" + price +
                ", composition='" + composition + '\'' +
                '}' +
                "\n";
    }
}
