package Factory.java;

public class FactoryMain {
    public static void main(String[] args) {
        Pizza saltPizza = PizzaFactory.mostCommonSaltyPizza();
        Pizza sweetPizza = PizzaFactory.mostCommonSweetPizza();
    }
}
