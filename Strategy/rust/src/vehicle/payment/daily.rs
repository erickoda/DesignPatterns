use crate::vehicle::brands::VehicleBrands;

use super::CalculateVehiclePayment;

#[derive(Clone)]
pub struct VehicleDailyPayment {
    pub factor: f64,
}

impl CalculateVehiclePayment for VehicleDailyPayment {
    fn calculate_payment(&self, begin: i64, end: i64, vehicle: VehicleBrands) -> f64 {
        return (begin - end) as f64 * self.factor;
    }
}
