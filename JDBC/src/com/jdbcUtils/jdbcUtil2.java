package com.jdbcUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class jdbcUtil2 {
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


    public static List getConnectAndStatments() throws SQLException {
        List list = new ArrayList();
        Connection connection  = DriverManager.getConnection(url,user,password);
        // 提前确定sql语句的编写，把需要的参数用？来代替
        PreparedStatement queryStatement =connection.prepareStatement("select * from users where `name` = ? and `password`= ?");
        PreparedStatement deleteStatement =connection.prepareStatement("delete from users where id = ?");
        PreparedStatement updateStatement =connection.prepareStatement("update users set `password` = ? where id = ?");
        PreparedStatement insertStatement =connection.prepareStatement("insert into users(id,`name`,`password`,birthday) values( ?, ?, ?,?)");


        list.add(connection);
        list.add(queryStatement);
        list.add(deleteStatement);
        list.add(updateStatement);
        list.add(insertStatement);

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
