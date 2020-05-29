package com.test.t1;



import com.jdbcUtils.jdbcUtil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Test02 {


    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
//            Class.forName("com.jdbcUtils.jdbcUtil");
            List list = jdbcUtil.getConnectAndStatment();
            connection = (Connection) list.get(0);
            statement = (Statement) list.get(1);
            // 查询
                  String sql = "select * from users";
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
            //增删改
            sql = "INSERT INTO users VALUES(4,\"zhaoliu\",123456,'zhaoliu@sina.com',NOW())";
            int resultNum = statement.executeUpdate(sql);

            if(resultNum ==1 ){
                System.out.println("成功插入");
            }

            sql = "UPDATE users SET`password` = 'root' WHERE id = 4";
            resultNum = statement.executeUpdate(sql);
            if(resultNum ==1 ){
                System.out.println("成功更改");
            }
            sql = "DELETE FROM users WHERE id =4";
            resultNum = statement.executeUpdate(sql);
            if(resultNum ==1 ){
                System.out.println("成功删除");
            }










        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            jdbcUtil.release(connection,statement,resultSet);
        }

    }



}
