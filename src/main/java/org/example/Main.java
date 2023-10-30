package org.example;

import org.example.dao.UserDao;
import org.example.dao.UserDaoHibernateImpl;

public class Main {

    /**
     * Before running, you need to select the implementation of UserDaoJDBCImpl or UserDaoHibernateImpl in UserServiceImpl.
     * */
    public static void main(String[] args) {

        UserDao userDao = new UserDaoHibernateImpl();

        // 1. Table user creation.
        userDao.createUsersTable();
        userDao.createUsersTable();

        // 2. Inserting 4 Users into the table with data of your choice.
        // After each insertion, there should be a console output (User with name - name has been added to the database).
        userDao.saveUser("Name1", "LastName1", (byte) 20);
        userDao.saveUser("Name2", "LastName2", (byte) 25);
        userDao.saveUser("Name3", "LastName3", (byte) 31);
        userDao.saveUser("Name4", "LastName4", (byte) 38);

        userDao.removeUserById(3);

        // 3. Fetching all Users from the database and printing to the console
        // (toString method should be overridden in the User class).
        userDao.getAllUsers();

        // 4. Clearing the User table.
        userDao.cleanUsersTable();

        // 5. Dropping the table.
        userDao.dropUsersTable();
        userDao.dropUsersTable();
    }
}
