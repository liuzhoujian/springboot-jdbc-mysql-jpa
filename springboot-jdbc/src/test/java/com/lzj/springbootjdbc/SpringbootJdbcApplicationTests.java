package com.lzj.springbootjdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJdbcApplicationTests {

    @Autowired
    DataSource dataSource;


    @Test
    public void contextLoads() throws Exception {
        //springboot默认使用数据源：class com.zaxxer.hikari.HikariDataSource
        //引入Druid后，使用druid数据源： class com.alibaba.druid.pool.DruidDataSource
        System.out.println(dataSource.getClass());

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

}

