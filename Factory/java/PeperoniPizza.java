package Factory.java;

public class PeperoniPizza extends Pizza {
    int quantityOfPeperoni;

    PeperoniPizza(int quantityOfPeperoni, PizzaSize size) {
        this.quantityOfPeperoni = quantityOfPeperoni;
        this.size = size;
    }
}
