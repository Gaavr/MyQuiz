package com.gaavr.myquiz.serviceIml;

import com.gaavr.myquiz.model.User;
import com.gaavr.myquiz.repository.UserRepository;
import com.gaavr.myquiz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void create(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> readUsers() {
        return userRepository.findAll();
    }

    @Override
    public User read(UUID id) {
        return userRepository.findById(id).get();
    }

    @Override
    public boolean update(User user, UUID id) {
        if (userRepository.existsById(id)) {
            user.setId(id);
            userRepository.save(user);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(UUID id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteAll() {
        try {
            userRepository.deleteAll();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
