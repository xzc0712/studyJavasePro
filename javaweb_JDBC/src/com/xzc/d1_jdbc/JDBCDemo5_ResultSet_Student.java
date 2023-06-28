package com.xzc.d1_jdbc;

import com.xzc.pojo.Student;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class JDBCDemo5_ResultSet_Student {
    /**
     * 查询Student对象，封装为Student对象中，并且存储到ArrayList集合中
     * 1. 定义实体类 Student
     * 2. 查询数据，封装到Student中
     * 3. 将Student对象存入ArrayList集合中
     * */
    @Test
    public  void testResultSet2_Student() throws Exception {
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

        // 创建集合
        ArrayList<Student> list = new ArrayList<>();
        while(rs.next()){
            Student stu = new Student();

            //根据列名查询
            int id = rs.getInt("id");
            String name =  rs.getString("name");
            int age = rs.getInt("age");
            String sex =  rs.getString("sex");
            String address =  rs.getString("address");
            double math = rs.getDouble("math");
            double english = rs.getDouble("english");
            String date = String.valueOf(rs.getDate("hire_data"));

            stu.setId(id);
            stu.setName(name);
            stu.setAge(age);
            stu.setSex(sex);
            stu.setAddress(address);
            stu.setMath(math);
            stu.setEnglish(english);
            stu.setDate(date);

            list.add(stu);

//            System.out.println(id + name + age);
//            System.out.println("--------------");
        }

        System.out.println(list);

        //7. 释放资源
        rs.close();
        stmt.close();
        conn.close();

    }
}
