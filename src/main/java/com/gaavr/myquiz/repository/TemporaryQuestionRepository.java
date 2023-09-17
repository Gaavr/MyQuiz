package com.gaavr.myquiz.repository;

import com.gaavr.myquiz.entity.TemporaryQuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemporaryQuestionRepository extends JpaRepository<TemporaryQuestionEntity, Long> {
}
