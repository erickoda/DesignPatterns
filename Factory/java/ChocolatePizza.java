package Factory.java;

public class ChocolatePizza extends Pizza {
    int chocolateQuality;

    ChocolatePizza(int chocolateQuality, PizzaSize size) {
        this.chocolateQuality = chocolateQuality;
        this.size = size;
    }
}
