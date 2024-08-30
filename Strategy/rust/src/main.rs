use vehicle::{
    brands::VehicleBrands,
    payment::{
        daily::VehicleDailyPayment, monthly::VehicleMonthlyPayment, CalculateVehiclePayment,
        VehiclePayment,
    },
};

pub mod vehicle;

fn main() {
    let daily_payment = VehicleDailyPayment { factor: 1.3 };
    let monthly_payment = VehicleMonthlyPayment { factor: 1.5 };

    let mut vehicle_payment: VehiclePayment = VehiclePayment {
        begin: 100,
        end: 1000,
        vehicle: VehicleBrands::Corolla,
        payment: Box::new(daily_payment),
    };

    println!("Preço Diário: {}", vehicle_payment.calculate());

    vehicle_payment.payment = Box::new(monthly_payment);

    println!("Preço Diário: {}", vehicle_payment.calculate());
}
