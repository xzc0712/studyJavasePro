package com.xzc.d1_jdbc;

import java.sql.*;

public class JDBCDemo2_Connection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1. 注册驱动
//        Class.forName("com.mysql.jdbc.Driver");

        //2. 获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/db_study1?characterEncoding=utf8&useSSL=false";
        String username = "root";
        String password = "123456";
        Connection conn =   DriverManager.getConnection(url,username,password);

        //3. 定义sql
        String sql1 = "update stu set  age = 51 where id = 1";
        String sql2 = "update stu set  age = 52 where id = 2";

        //4. 获取执行sql语句对象Statement
        Statement stmt = conn.createStatement();

        //开启事务
        try {
            //开启事务
            conn.setAutoCommit(false);

            int count1  = stmt.executeUpdate(sql1);
            System.out.println(count1);
            int count2  = stmt.executeUpdate(sql2);
            System.out.println(count2);

            //提交事务
            conn.commit();

        } catch (SQLException e) {
            //回滚事务
            conn.rollback();

            throw new RuntimeException(e);
        }

        //7. 释放资源
        stmt.close();
        conn.close();

    }
}
