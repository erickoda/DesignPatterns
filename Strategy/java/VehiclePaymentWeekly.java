

public class VehiclePaymentWeekly implements VehiclePaymentCalculator {

    private double factor = 0.9;

    VehiclePaymentWeekly(double factor) {
        this.factor = factor;
    }

    public double calculate(Vehicle vehicle, long begin, long end) {
        return (double) (begin-end)*factor;
    }
}
