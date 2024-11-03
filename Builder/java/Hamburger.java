package Builder.java;

public class Hamburger {
    int quantityOfMeat;
    boolean hasCheese;
    boolean hasLettuce;
    boolean hasTomatoes;
    boolean hasBacon;
    boolean isVegetarian;

    public Hamburger(
            int quantityOfMeat,
            boolean hasCheese,
            boolean hasLettuce,
            boolean hasTomatoes,
            boolean hasBacon,
            boolean isVegetarian) {
        this.quantityOfMeat = quantityOfMeat;
        this.hasCheese = hasCheese;
        this.hasLettuce = hasLettuce;
        this.hasBacon = hasBacon;
        this.isVegetarian = isVegetarian;
    }

}
