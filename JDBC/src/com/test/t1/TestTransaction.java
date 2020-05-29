package com.test.t1;

import com.jdbcUtils.jdbcUtil;
import com.mysql.cj.protocol.Resultset;

import java.io.Reader;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class TestTransaction {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        Resultset resultset = null;
        List list;
        int i;


        try {
            Class.forName("com.jdbcUtils.jdbcUtil");

            list = jdbcUtil.getConnectAndStatment();
            connection = (Connection) list.get(0);
            statement = (Statement) list.get(1);
            connection.setAutoCommit(false);

            String sql = "update users set password='111111' where id = 1";
            i = statement.executeUpdate(sql);

            i = 1/0;

            sql = "update users set password='111111' where id = 2";

            i = statement.executeUpdate(sql);


            connection.commit();











        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }


    }




}
