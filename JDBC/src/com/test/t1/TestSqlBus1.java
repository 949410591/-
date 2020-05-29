package com.test.t1;

import com.jdbcUtils.jdbcUtil2;

import java.sql.*;
import java.util.List;

public class TestSqlBus1 {
    public static void main(String[] args) {
        String name = "'or '1=1";
        String password = "' or 1=1";
        login(name,password);
    }

    private static void login(String name, String password) {
        Connection connection = null;
        PreparedStatement queryStatement = null;
        ResultSet resultSet = null;
        List list = null;

        try {
            Class.forName("com.jdbcUtils.jdbcUtil2");


            list = jdbcUtil2.getConnectAndStatments();

            connection = (Connection) list.get(0);
            queryStatement = (PreparedStatement) list.get(1);
            int i;

            //查询

            queryStatement.setString(1,name);

            queryStatement.setString(2,password);

            resultSet = queryStatement.executeQuery();
            while (resultSet.next()){
                System.out.print(resultSet.getObject("id"));
                System.out.print(" ");
                System.out.print(resultSet.getObject("name"));
                System.out.print(" ");
                System.out.print(resultSet.getObject("password"));
                System.out.print(" ");
                System.out.print(resultSet.getObject("email"));
                System.out.print(" ");
                System.out.println(resultSet.getObject("birthday"));
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        finally {
            jdbcUtil2.release(connection,queryStatement,resultSet);

        }
    }

}
