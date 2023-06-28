package com.xzc.d1_jdbc;

import org.testng.annotations.Test;

import java.sql.*;

public class JDBCDemo4_ResultSet {
    /**
     * 执行DQL
     * */
    @Test
    public  void testResultSet() throws Exception {
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
        ResultSet rs = stmt.executeQuery(sql);

        //6. 遍历处理结果
        //6.1 光标向下移动一行，判断当前行是否有数据
        while(rs.next()){
            //6.2 根据列名查询
//            int id = rs.getInt(1);
//            String name =  rs.getString(2);
//            int age = rs.getInt(3);

            //根据列名查询
            int id = rs.getInt("id");
            String name =  rs.getString("name");
            int age = rs.getInt("age");

            System.out.println(id + name + age);
            System.out.println("--------------");
        }

        //7. 释放资源
        rs.close();
        stmt.close();
        conn.close();

    }
}
