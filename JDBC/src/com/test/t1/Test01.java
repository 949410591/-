package com.test.t1;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class Test01 {
    public static void main(String[] args)  {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306 /jdbcStudy?useUnicode=true&characterEncoding=utf8&useSSL=true&serverTimezone=GMT";
            String user = "root";
            String password = "root";
            connection = DriverManager.getConnection(url,user,password);

            statement = connection.createStatement();

            String sql = "Select * from users";
            resultSet = statement.executeQuery(sql);
            System.out.println();
            while(resultSet.next()){
                System.out.print(resultSet.getObject("id"));
                System.out.print(" ");

                System.out.print(resultSet.getObject("name"));
                System.out.print(" ");

                System.out.print(resultSet.getObject("password"));
                System.out.print(" ");

                System.out.print(resultSet.getObject("email"));
                System.out.println("");

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if(connection != null){
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

            if (resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}


