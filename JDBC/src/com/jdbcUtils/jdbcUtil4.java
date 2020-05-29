package com.jdbcUtils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;

public class jdbcUtil4 {

    static DataSource dataSource;

    static {



        try {

            dataSource = new ComboPooledDataSource("mysql8");

        } catch (Exception e) {
            e.printStackTrace();

        }


    }


    public static List getConnectAndStatments() throws SQLException {
        List list = new ArrayList();
        Connection connection  = dataSource.getConnection();
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
