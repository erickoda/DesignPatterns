use hamburger::builder::HamburgerBuilder;

mod hamburger;

fn main() {
    let my_crazy_hamburger = HamburgerBuilder::default()
        .add_bacon()
        .add_cheese()
        .add_lettuce()
        .add_meat(3)
        .add_tomatoes()
        .build();
}
