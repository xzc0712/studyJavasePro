package com.xzc.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Map;
import java.util.Properties;

/**
 * Druid数据库连接池演示*/

public class DruidDemo {
    public static void main(String[] args) throws Exception {
        // 1. 导入jar包
        // 2. 定义配置文件（人工配置）

        // 3. 加载配置文件
        Properties prop = new Properties();

        //3.1 查看当前位置
//        String dirLoc =  System.getProperty("user.dir"); //F:\idea_place\studysepro
//        System.out.println(System.getProperty("user.dir"));
        prop.load(new FileInputStream("javaweb_JDBC/src/druid.properties"));
        // 4. 获取连接池对象
        DataSource ds =  DruidDataSourceFactory.createDataSource(prop);

        // 5 . 获取数据库连接Connection
        Connection conn = ds.getConnection();

        System.out.println(conn);

    }
}
