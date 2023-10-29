package org.example;

import org.example.dao.UserDao;
import org.example.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserDao userService = new UserServiceImpl();

        // 1. Table user creation.
        userService.createUsersTable();
        userService.createUsersTable();

        // 2. Inserting 4 Users into the table with data of your choice.
        // After each insertion, there should be a console output (User with name - name has been added to the database).
        userService.saveUser("Name1", "LastName1", (byte) 20);
        userService.saveUser("Name2", "LastName2", (byte) 25);
        userService.saveUser("Name3", "LastName3", (byte) 31);
        userService.saveUser("Name4", "LastName4", (byte) 38);

//        userServiceHibernate.removeUserById(3);

        // 3. Fetching all Users from the database and printing to the console
        // (toString method should be overridden in the User class).
        userService.getAllUsers();

        // 4. Clearing the User table.
        userService.cleanUsersTable();

        // 5. Dropping the table.
        userService.dropUsersTable();
        userService.dropUsersTable();
    }
}
