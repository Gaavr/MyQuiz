package com.gaavr.myquiz.repository;

import com.gaavr.myquiz.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
