package Singleton.java;

public final class DatabaseConnection {
    private static DatabaseConnection instance;
    String name;

    private DatabaseConnection(String name) {
        this.name = name;
    }

    public static DatabaseConnection createConnection(String connection_name) {

        if (instance == null) {
            instance = new DatabaseConnection(connection_name);
        }

        return instance;
    }

    public static DatabaseConnection getConnection() {

        if (instance == null) {
            instance = new DatabaseConnection("");
        }

        return instance;
    }
}
