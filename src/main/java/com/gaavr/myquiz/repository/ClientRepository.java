package com.gaavr.myquiz.repository;

import com.gaavr.myquiz.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
