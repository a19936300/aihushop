package com.binbinxiu.aihushop.redisson;

import cn.hutool.core.util.RandomUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * TODO
 *
 * @author binbin
 * @date 2022/1/6 19:03
 */
@SpringBootTest
public class BatchDataInsert {

    @Autowired
    private DataSource dataSource;


    @Test
    public void test1(){
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 15000000; i++) {
            builder.append(RandomUtil.randomInt(1,10000)).append("\t");
            builder.append(RandomUtil.randomInt(10000,100000)).append("\t");
            builder.append(RandomUtil.randomInt(10000,100000)).append("\t");
            builder.append(RandomUtil.randomInt(10000,100000)).append("\t");
            builder.append(RandomUtil.randomInt(10000,100000)).append("\t");
            builder.append(RandomUtil.randomInt(100000,1000000)).append("\n");
        }

        byte[] bytes = builder.toString().getBytes();

        InputStream dataStream = new ByteArrayInputStream(bytes);

        String loadSql = "LOAD DATA LOCAL INFILE 'sql.csv' IGNORE INTO TABLE tmp_table (a, b, c,d,e,f)" ;

        Connection conn = null;

        try {
            conn = dataSource.getConnection(); //此处我直接注入的spring 的dataSource，也可以用jdbc的 conn = (Connection) DriverManager.getConnection(url, username, password);

            PreparedStatement statement = conn.prepareStatement(loadSql);

            if (statement.isWrapperFor(com.mysql.cj.jdbc.JdbcStatement.class)) {
                com.mysql.cj.jdbc.ClientPreparedStatement mysqlStatement = statement.unwrap(com.mysql.cj.jdbc.ClientPreparedStatement.class);

                mysqlStatement.setLocalInfileInputStream(dataStream);

                mysqlStatement.executeUpdate();

            }

        } catch (Exception e) {
            e.printStackTrace();

        }

    }


}
