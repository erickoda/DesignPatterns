use super::Hamburger;

#[derive(Default)]
pub struct HamburgerBuilder {
    pub quantity_of_meat: Option<usize>,
    pub has_cheese: Option<bool>,
    pub has_lettuce: Option<bool>,
    pub has_tomatoes: Option<bool>,
    pub has_bacon: Option<bool>,
    pub is_vegetarian: Option<bool>,
}

impl HamburgerBuilder {
    pub fn add_meat(&mut self, quantity: usize) -> &mut Self {
        self.quantity_of_meat = Some(quantity);
        return self;
    }

    pub fn add_cheese(&mut self) -> &mut Self {
        self.has_cheese = Some(true);
        return self;
    }

    pub fn add_lettuce(&mut self) -> &mut Self {
        self.has_lettuce = Some(true);
        return self;
    }

    pub fn add_tomatoes(&mut self) -> &mut Self {
        self.has_tomatoes = Some(true);
        return self;
    }

    pub fn add_bacon(&mut self) -> &mut Self {
        self.has_bacon = Some(true);
        return self;
    }

    pub fn vegetarian(&mut self) -> &mut Self {
        self.is_vegetarian = Some(true);
        return self;
    }

    pub fn build(&mut self) -> Hamburger {
        let quantity_of_meat = self.quantity_of_meat.unwrap_or_default();
        let has_cheese = self.has_cheese.unwrap_or_default();
        let has_lettuce = self.has_lettuce.unwrap_or_default();
        let has_tomatoes = self.has_tomatoes.unwrap_or_default();
        let has_bacon = self.has_bacon.unwrap_or_default();
        let is_vegetarian = self.is_vegetarian.unwrap_or_default();

        Hamburger::new(
            quantity_of_meat,
            has_cheese,
            has_lettuce,
            has_tomatoes,
            has_bacon,
            is_vegetarian,
        )
    }
}
