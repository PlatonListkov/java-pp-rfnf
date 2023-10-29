package org.example.service;

import org.example.dao.UserDaoHibernateImpl;
import org.example.dao.UserDaoJDBCImpl;

public class UserServiceImpl extends UserDaoJDBCImpl implements UserService {

}