package com.gaavr.myquiz.repository;

import com.gaavr.myquiz.entity.DeskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeskRepository extends JpaRepository<DeskEntity, Long> {
}
