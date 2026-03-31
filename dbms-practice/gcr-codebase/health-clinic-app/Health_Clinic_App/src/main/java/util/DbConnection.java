package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    public static Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/clinic";
        String user = "root";
        String password = "root";
        return DriverManager.getConnection(url, user, password);
    }
}

