package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
    private static dbConnection dbConnection = null;
    private Connection connection;

    private dbConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ijse_intake", "root", "1234");
    }

    public static dbConnection getInstance() throws SQLException, ClassNotFoundException {
        return (dbConnection==null)? dbConnection= new dbConnection(): dbConnection;
    }
}
