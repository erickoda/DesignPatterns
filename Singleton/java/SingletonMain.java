package Singleton.java;

public class SingletonMain {
    public static void main(String[] args) {
        DatabaseConnection db = DatabaseConnection.createConnection("MySql");

        DatabaseConnection same_db = DatabaseConnection.getConnection();

        System.out.println(db.name);
        System.out.println(same_db.name);
    }
}
