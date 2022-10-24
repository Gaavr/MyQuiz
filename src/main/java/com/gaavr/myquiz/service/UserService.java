package com.gaavr.myquiz.service;

import com.gaavr.myquiz.model.User;

import java.util.List;

public interface UserService {

    void create(User user);

    List<User> readUsers();

    User read(String id);

    boolean update(User user, String id);

    boolean delete(String id);

    boolean deleteAll();
}
