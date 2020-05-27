package com.jdbcUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class jdbcUtil {
    static String user;
    static String url;
    static String password;

    static {

        ResourceBundle resourceBundle = ResourceBundle.getBundle("com/jdbcUtils/config");
        try {

            Class.forName(resourceBundle.getString("driver"));

            user = resourceBundle.getString("user");
            url =resourceBundle.getString("url");
            password =resourceBundle.getString("password");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }


    public static List getConnectAndStatment() throws SQLException {
        List list = new ArrayList();
        Connection connection  = DriverManager.getConnection(url,user,password);
        Statement statement = connection.createStatement();

        list.add(connection);
        list.add(statement);

        return list;
    }


    public static void release(Connection connection, Statement statement, ResultSet resultSet){
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }




}
