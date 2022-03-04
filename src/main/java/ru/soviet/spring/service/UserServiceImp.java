package ru.soviet.spring.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;
import ru.soviet.spring.dao.UserDaoImp;
import ru.soviet.spring.models.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDaoImp userDaoImp;

    @Override
    public User show(long id) {
        return userDaoImp.show(id);
    }

    @Transactional
    @Override
    public void save(User user) {
        userDaoImp.save(user);
    }

    @Transactional
    @Override
    public void update(User updateUser) {
        userDaoImp.update(updateUser);
    }

    @Transactional
    @Override
    public void delete(long id) {
        userDaoImp.delete(id);
    }

    @Override
    public List<User> index() {
        return userDaoImp.index();
    }
}
