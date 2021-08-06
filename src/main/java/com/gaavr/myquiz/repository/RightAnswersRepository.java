package com.gaavr.myquiz.repository;

import com.gaavr.myquiz.model.RightAnswers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RightAnswersRepository extends JpaRepository<RightAnswers, Integer> {
}
