package com.yyt.dao;

import com.yyt.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserDAOTest {
    @Autowired
    private UserDAO userDAO;

    @Test
    public void test1() {
        User user = userDAO.queryById(44);
        System.out.println(user);
    }
}
