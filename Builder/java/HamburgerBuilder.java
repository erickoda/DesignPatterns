package Builder.java;

public class HamburgerBuilder {
    int quantityOfMeat = 0;
    boolean hasCheese = false;
    boolean hasLettuce = false;
    boolean hasTomatoes = false;
    boolean hasBacon = false;
    boolean isVegetarian = false;

    public HamburgerBuilder addQuantityOfMeat(int quantityOfMeat) {
        this.quantityOfMeat = quantityOfMeat;
        return this;
    }

    public HamburgerBuilder addCheese() {
        this.hasCheese = true;
        return this;
    }

    public HamburgerBuilder addLettuce() {
        this.hasLettuce = true;
        return this;
    }

    public HamburgerBuilder addTomatoes() {
        this.hasTomatoes = true;
        return this;
    }

    public HamburgerBuilder addBacon() {
        this.hasBacon = true;
        return this;
    }

    public HamburgerBuilder isVegetarian() {
        this.isVegetarian = true;
        return this;
    }

    public Hamburger build() {
        return new Hamburger(quantityOfMeat, hasCheese, hasLettuce, hasTomatoes, hasBacon, isVegetarian);
    }
}
