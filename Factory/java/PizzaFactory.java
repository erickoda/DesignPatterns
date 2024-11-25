package Factory.java;

public class PizzaFactory {
    public static Pizza mostCommonSaltyPizza() {
        return new PeperoniPizza(10, PizzaSize.Big);
    }

    public static Pizza mostCommonSweetPizza() {
        return new ChocolatePizza(2, PizzaSize.Small);
    }
}
