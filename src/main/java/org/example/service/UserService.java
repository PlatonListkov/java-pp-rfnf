package org.example.service;

import org.example.dao.UserDao;
import org.example.model.User;

import java.util.List;

public interface UserService extends UserDao {
    void createUsersTable();

    void dropUsersTable();

    void saveUser(String name, String lastName, byte age);

    void removeUserById(long id);

    List<User> getAllUsers();

    void cleanUsersTable();
}
