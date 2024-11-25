pub mod builder;

pub struct Hamburger {
    pub quantity_of_meat: usize,
    pub has_cheese: bool,
    pub has_lettuce: bool,
    pub has_tomatoes: bool,
    pub has_bacon: bool,
    pub is_vegetarian: bool,
}

impl Hamburger {
    pub fn new(
        quantity_of_meat: usize,
        has_cheese: bool,
        has_lettuce: bool,
        has_tomatoes: bool,
        has_bacon: bool,
        is_vegetarian: bool,
    ) -> Self {
        Self {
            quantity_of_meat,
            has_cheese,
            has_lettuce,
            has_tomatoes,
            has_bacon,
            is_vegetarian,
        }
    }
}
