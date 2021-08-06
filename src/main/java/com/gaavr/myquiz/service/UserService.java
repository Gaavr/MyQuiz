package com.gaavr.myquiz.service;

import com.gaavr.myquiz.model.User;

import java.util.List;

public interface UserService {

    void create(User user);

    List<User> readUsers();

    User read(int id);

    boolean update(User user, int id);

    boolean delete(int id);

    boolean deleteAll();
}
