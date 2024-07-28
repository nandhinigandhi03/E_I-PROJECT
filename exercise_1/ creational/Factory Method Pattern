// Factory Method Pattern

public abstract class DatabaseConnection {
    public abstract void connect();
}

public class MySQLConnection extends DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }
}

public class PostgreSQLConnection extends DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL database...");
    }
}

public class OracleConnection extends DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to Oracle database...");
    }
}

public class DatabaseConnectionFactory {
    public static DatabaseConnection createConnection(String databaseType) {
        switch (databaseType) {
            case "mysql":
                return new MySQLConnection();
            case "postgresql":
                return new PostgreSQLConnection();
            case "oracle":
                return new OracleConnection();
            default:
                throw new UnsupportedOperationException("Unsupported database type");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        DatabaseConnection connection = DatabaseConnectionFactory.createConnection("mysql");
        connection.connect();
    }
}
