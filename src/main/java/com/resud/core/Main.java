package com.resud.core;

import java.sql.*;

/**
 * Created by RRM on 06.04.17.
 */
public class Main {



    public static void main(String[] args){

        DBHelper dbHelper = new DBHelper();
        try {
            Statement statement = dbHelper.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
