package cn.pw.dao;

import cn.pw.entities.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

@MapperScan
public interface UserDao {
    public User getUser(int id);

    public void deleteUser(int id );
}
