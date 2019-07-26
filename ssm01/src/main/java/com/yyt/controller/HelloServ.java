package com.yyt.controller;

import com.yyt.entity.User;
import com.yyt.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloServ {
    @Autowired
    private HelloService helloService;
    @RequestMapping("/hello")
    public String hello(int id, Model model){
        User user = helloService.hello(id);
        model.addAttribute("user",user);
        return "hello";
    }
}
