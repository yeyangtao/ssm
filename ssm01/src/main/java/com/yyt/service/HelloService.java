package com.yyt.service;

import com.yyt.dao.UserDAO;
import com.yyt.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
@Autowired
private UserDAO userDAO;
    public User hello(int id) {
       return userDAO.queryById(id);

    }
}
