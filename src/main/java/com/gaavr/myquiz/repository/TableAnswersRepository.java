package com.gaavr.myquiz.repository;

import com.gaavr.myquiz.model.TableAnswers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TableAnswersRepository extends JpaRepository<TableAnswers, UUID> {
}
