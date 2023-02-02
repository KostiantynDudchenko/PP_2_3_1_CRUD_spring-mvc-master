package web.service;


import org.springframework.stereotype.Service;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public User show(int id) {
        return userDAO.show(id);
    }

    @Override
    public void update(int id, User user) {
        userDAO.update(id, user);
    }

    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }
}
