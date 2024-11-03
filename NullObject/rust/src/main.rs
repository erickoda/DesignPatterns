#[derive(Debug)]
struct Person {
    name: String,
    age: i64,
}

impl Default for Person {
    fn default() -> Person {
        Person {
            name: String::default(),
            age: i64::default(),
        }
    }
}

fn main() {
    let person = Person::default();
    println!("{:?}", person);
}
