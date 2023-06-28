package com.xzc.d1_jdbc;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1. 注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2. 获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/db_study1?characterEncoding=utf8&useSSL=false";
        String username = "root";
        String password = "123456";
        Connection conn =   DriverManager.getConnection(url,username,password);

        //3. 定义sql
        String sql = "select * from stu";

        //4. 获取执行sql语句对象Statement
        Statement stmt = conn.createStatement();

        //5. 执行sql
        ResultSet count = stmt.executeQuery(sql);

        //6. 处理结果
        System.out.println(count);

        //7. 释放资源
        stmt.close();
        conn.close();

    }
}
