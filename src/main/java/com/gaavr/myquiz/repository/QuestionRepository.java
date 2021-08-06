package com.gaavr.myquiz.repository;

import com.gaavr.myquiz.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
