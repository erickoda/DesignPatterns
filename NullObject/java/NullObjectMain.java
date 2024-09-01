class NullObjectMain {
    public static void main(String[] args) {
        int person_index = 10;
        Person person = getPerson(person_index);

        System.out.println("Nome: " + person.name);
        System.out.println("Idade: " + person.age);
    }


    static Person getPerson(int index) {
        if (index == 10) {
            return new NullPerson();
        }

        return new Person("Jorge", 20);
    }

}