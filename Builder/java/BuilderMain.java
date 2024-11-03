package Builder.java;

public class BuilderMain {
    public static void main(String[] args) {
        Hamburger myCrazyHamburger = new HamburgerBuilder()
                .addQuantityOfMeat(3)
                .addBacon()
                .addCheese()
                .addLettuce()
                .isVegetarian()
                .build();
    }
}
