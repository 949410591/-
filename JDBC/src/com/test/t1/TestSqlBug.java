package com.test.t1;

import com.jdbcUtils.jdbcUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class TestSqlBug {
    public static void main(String[] args) {
        String user = "zhansan";
        String password = "123456";
        login(user,password);
    }

    private static void login(String user, String password) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.jdbcUtils.jdbcUtil");
            List list = jdbcUtil.getConnectAndStatment();
            connection = (Connection) list.get(0);
            statement = (Statement) list.get(1);
            // 查询
            String sql = "select * from users where `name` = '" + user + "' and password = '" + password+"'";
            sql = "select * from users where `name` = '" + "'or '1=1"+"'and password ='" + "' or 1=1";




            resultSet = statement.executeQuery(sql);

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
            jdbcUtil.release(connection,statement,resultSet);
        }



    }


}
