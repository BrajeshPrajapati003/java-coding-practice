import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BasicJdbcExample {

    // JDBC URL for H2 in-memory database.
    // 'testdb' is the database name. DB_CLOSE_DELAY=-1 keeps the database alive
    // as long as the JVM is running, which is useful for testing.
    private static final String JDBC_URL = "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1";
    private static final String USER = "sa"; // Default H2 username
    private static final String PASSWORD = ""; // Default H2 password

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // 1. Establish a connection to the database
            // DriverManager.getConnection() attempts to establish a connection to the given database URL.
            System.out.println("Attempting to connect to the database...");
            connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
            System.out.println("Connection established successfully!");

            // 2. Create a Statement object for executing SQL queries
            statement = connection.createStatement();

            // 3. Execute SQL to create a table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS users (" +
                                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                                    "name VARCHAR(255) NOT NULL," +
                                    "email VARCHAR(255) NOT NULL UNIQUE" +
                                    ")";
            System.out.println("\nCreating table 'users'...");
            statement.execute(createTableSQL);
            System.out.println("Table 'users' created or already exists.");

            // 4. Insert data using PreparedStatement (recommended for security and performance)
            String insertSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
            preparedStatement = connection.prepareStatement(insertSQL);

            System.out.println("\nInserting data...");
            // Insert user 1
            preparedStatement.setString(1, "Alice Wonderland");
            preparedStatement.setString(2, "alice@example.com");
            int rowsAffected1 = preparedStatement.executeUpdate();
            System.out.println("Inserted " + rowsAffected1 + " row(s) for Alice.");

            // Insert user 2
            preparedStatement.setString(1, "Bob The Builder");
            preparedStatement.setString(2, "bob@example.com");
            int rowsAffected2 = preparedStatement.executeUpdate();
            System.out.println("Inserted " + rowsAffected2 + " row(s) for Bob.");

            // 5. Query data
            String selectSQL = "SELECT id, name, email FROM users";
            System.out.println("\nFetching data from 'users' table:");
            resultSet = statement.executeQuery(selectSQL);

            // 6. Process the ResultSet
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }

        } catch (SQLException e) {
            // Handle any SQL exceptions
            System.err.println("SQL Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // 7. Close resources in reverse order of creation to avoid resource leaks
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
                System.out.println("\nDatabase resources closed.");
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
