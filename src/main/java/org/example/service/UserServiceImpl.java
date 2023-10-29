package org.example.service;

import org.example.dao.UserDao;
import org.example.dao.UserDaoHibernateImpl;
import org.example.dao.UserDaoJDBCImpl;
import org.example.model.User;

import java.util.List;

public class UserServiceImpl extends UserDaoJDBCImpl implements UserService, UserDao {
    public void createUsersTable() {
        super.createUsersTable();
    }

    public void dropUsersTable() {
        super.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        super.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        super.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return super.getAllUsers();
    }

    public void cleanUsersTable() {
        super.cleanUsersTable();
    }
}