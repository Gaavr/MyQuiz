package com.gaavr.myquiz.repository;

import com.gaavr.myquiz.model.RightAnswers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RightAnswersRepository extends JpaRepository<RightAnswers, UUID> {
}
