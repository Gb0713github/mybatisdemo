package cn.pw.controller;

import cn.pw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(HttpServletRequest httpServletRequest){
        String name = httpServletRequest.getParameter("name");
        System.out.println(name+"***********************");
        return "userInfo";
    }
}
