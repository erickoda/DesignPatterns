

public class VehiclePaymentDaily implements VehiclePaymentCalculator {
    private double factor;

    VehiclePaymentDaily(double factor) {
        this.factor = factor;
    }

    public double getFactor() {
        return factor;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }

    public double calculate(Vehicle vehicle, long begin, long end) {
        return (double) (end - begin)*this.factor*this.vehicleFactor(vehicle);
    }

    private double vehicleFactor(Vehicle vehicle) {
        switch (vehicle) {
            case Corolla:
                return 0.1;
            default:
                return 0.2;
        }
    }
}