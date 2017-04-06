package com.resud.core;

import java.sql.*;

/**
 * Created by RRM on 06.04.17.
 */
public class DBHelper {

    private final String URL = "jdbc:mysql://127.0.0.1:3306/Project";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";

    private Connection connection;

    public DBHelper(){
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (!connection.isClosed()){
                System.out.println("Соединение с БД установлено!");
            }
        } catch (SQLException sql){
            sql.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
