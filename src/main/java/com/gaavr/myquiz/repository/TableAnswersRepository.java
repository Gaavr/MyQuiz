package com.gaavr.myquiz.repository;

import com.gaavr.myquiz.model.TableAnswers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableAnswersRepository extends JpaRepository<TableAnswers, String> {
}
