package cn.pw.service;

import cn.pw.dao.UserDao;
import cn.pw.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUserInfo(){
        User user = userDao.getUser(2);
        return user;
    }
}
