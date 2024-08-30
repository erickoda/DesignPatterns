use super::brands::VehicleBrands;

pub mod daily;
pub mod monthly;

pub trait CalculateVehiclePayment {
    fn calculate_payment(&self, begin: i64, end: i64, vehicle: VehicleBrands) -> f64;
}

pub struct VehiclePayment {
    pub begin: i64,
    pub end: i64,
    pub vehicle: VehicleBrands,
    pub payment: Box<dyn CalculateVehiclePayment>,
}

impl VehiclePayment {
    pub fn calculate(&self) -> f64 {
        self.payment
            .calculate_payment(self.begin, self.end, self.vehicle.clone())
    }
}
