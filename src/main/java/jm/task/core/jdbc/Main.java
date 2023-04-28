package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl us = new UserServiceImpl();
        us.createUsersTable();
        us.saveUser("Mihail","Ivanov", (byte) 37);
        us.saveUser("Petra","Petrov", (byte) 37);
        us.saveUser("Sidor","Sidorov", (byte) 37);
        System.out.println(us.getAllUsers());
        us.cleanUsersTable();
    }
}

// реализуйте алгоритм здесь

