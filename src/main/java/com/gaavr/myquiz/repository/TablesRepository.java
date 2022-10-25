package com.gaavr.myquiz.repository;

import com.gaavr.myquiz.model.Tables;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TablesRepository extends JpaRepository<Tables, UUID> {
}
