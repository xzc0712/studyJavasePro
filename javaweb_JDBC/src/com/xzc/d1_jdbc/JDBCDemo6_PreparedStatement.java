package com.xzc.d1_jdbc;

import java.sql.*;

public class JDBCDemo6_PreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        //1. 注册驱动
//        Class.forName("com.mysql.jdbc.Driver");

        //2. 获取连接
        // useSeverPreStmts = true 打开预编译
        String url = "jdbc:mysql://127.0.0.1:3306/db_study1?characterEncoding=utf8&useSSL=false";
        String username = "root";
        String password = "123456";
        Connection conn =   DriverManager.getConnection(url,username,password);

        //3. 定义sql
        String sql = "select * from stu where name = ? or address = ?";

        //4. 获取执行sql语句对象Statement
        PreparedStatement pstmt = conn.prepareStatement(sql);

        //设置？的值
        String name = "马云";
        String address = "湖南";
        pstmt.setString(1,name);
        pstmt.setString(2,address);

        // 执行SQL
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()){
            System.out.println("success");
        }else{
            System.out.println("failed");
        }

        //7. 释放资源
        rs.close();
        pstmt.close();
        conn.close();

    }
}
