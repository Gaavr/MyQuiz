package com.gaavr.myquiz.service;

import com.gaavr.myquiz.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    void create(User user);

    List<User> readUsers();

    User read(UUID id);

    boolean update(User user, UUID id);

    boolean delete(UUID id);

    boolean deleteAll();
}
