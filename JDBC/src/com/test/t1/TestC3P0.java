package com.test.t1;

import com.jdbcUtils.jdbcUtil3;
import com.jdbcUtils.jdbcUtil4;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

public class TestC3P0 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement queryStatement = null;
        PreparedStatement deleteStatement = null;
        PreparedStatement updateStatement = null;
        PreparedStatement insertStatement = null;
        ResultSet resultSet = null;
        List list = null;

        try {


            list = jdbcUtil4.getConnectAndStatments();

            connection = (Connection) list.get(0);
            queryStatement = (PreparedStatement) list.get(1);
            deleteStatement = (PreparedStatement) list.get(2);
            updateStatement = (PreparedStatement) list.get(3);
            insertStatement = (PreparedStatement) list.get(4);

            int i;
            connection.setAutoCommit(false);
            //查询


            String name = "zhansan";
            String password = "123456";
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
            //插入
            insertStatement.setInt(1,4);
            insertStatement.setString(2,"wangwwu");
            insertStatement.setString(3,"123456");
            java.util.Date date = new java.util.Date();
            insertStatement.setDate(4,new Date(date.getTime()));
            i = insertStatement.executeUpdate();
            if(i !=0){
                System.out.println("插入成功");
            }

            //更新
            updateStatement.setString(1,"111111");
            updateStatement.setInt(2,4);
            i = updateStatement.executeUpdate();
            if(i !=0){
                System.out.println("更新成功");
            }

            //删除

            deleteStatement.setInt(1,4);
            i = deleteStatement.executeUpdate();
            if(i!=0){
                System.out.println("删除成功");
            }




        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtil4.release(connection,null,resultSet);
            for (int i = 1; i < list.size(); i++) {
                jdbcUtil4.release(null, (Statement) list.get(i),null);

            }
        }


    }


}
