import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost/Students";
        String USER = "root";
        String PASS = "Mahi@1234";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASS)) {
            System.out.println("inserted successfully");
            System.out.println(connection);
        } catch (SQLException e) {
            System.out.println("insertion failed:" + e.getMessage());
        }
    }
}


