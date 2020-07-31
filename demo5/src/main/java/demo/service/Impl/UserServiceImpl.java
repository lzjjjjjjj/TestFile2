package demo.service.Impl;

import demo.dao.UserDao;
import demo.pojo.User;
import demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public List<User> list(){
        return userDao.list();
    }
}
