public class NullPerson extends Person {
    @Override
    public String getName() {
        return "";
    }

    @Override
    public int getAge() {
        return 0;
    }
}
