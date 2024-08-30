

public class VehiclePayment {
    private Vehicle vehicle;
    private long begin;
    private long end;
    private VehiclePaymentCalculator vehiclePaymentCalculator;

    VehiclePayment(Vehicle vehicle, long begin, long end, VehiclePaymentCalculator vehiclePaymentCalculator) {
        this.vehicle = vehicle;
        this.begin = begin;
        this.end = end;
        this.vehiclePaymentCalculator = vehiclePaymentCalculator;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public long getBegin() {
        return begin;
    }

    public long getEnd() {
        return end;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setBegin(long begin) {
        this.begin = begin;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    public VehiclePaymentCalculator getVehiclePaymentCalculator() {
        return vehiclePaymentCalculator;
    }

    public void setVehiclePaymentCalculator(VehiclePaymentCalculator vehiclePaymentCalculator) {
        this.vehiclePaymentCalculator = vehiclePaymentCalculator;
    }

    public double calculateBill() {
        return vehiclePaymentCalculator.calculate(vehicle, begin, end);
    }
}