public class StrategyMain {
    public static void main(String[] args) {
        VehiclePaymentDaily dailyPayment = new VehiclePaymentDaily(1.8);
        VehiclePaymentWeekly weeklyPayment = new VehiclePaymentWeekly(2.0);
        VehiclePayment payment = new VehiclePayment(Vehicle.Corolla, 0, 100, dailyPayment);

        System.out.println("Pagamento Diário: " + payment.calculateBill());

        payment.setVehiclePaymentCalculator(weeklyPayment);

        System.out.println("Pagamento Semanal: " + payment.calculateBill());

    }
}

