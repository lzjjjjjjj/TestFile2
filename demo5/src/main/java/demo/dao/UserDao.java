package demo.dao;

import demo.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    //显示所有user
    List<User> list();
}
