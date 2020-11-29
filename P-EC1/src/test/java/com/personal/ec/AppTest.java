package com.personal.ec;

import com.personal.ec.dao.TestDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.UUID;

@RunWith(SpringRunner.class)
//启动Spring
@SpringBootTest
public class AppTest {
    @Autowired
    TestDao dao;
    @Test
    public void test() {
        int i = dao.addItem(new HashMap<String, Object>() {{
            put("id", ((int) (Math.random()*100000)));
            put("time", new Timestamp(System.currentTimeMillis()));
            put("name", "qwe");
        }});
        System.out.println(i);
    }

}
