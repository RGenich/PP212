package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String URL = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Njkmznnb-24";

    public static Connection getDBConnection() throws SQLException {
        return  DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
