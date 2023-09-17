package com.gaavr.myquiz.service;

import com.gaavr.myquiz.entity.TemporaryQuestionEntity;

import java.util.List;

public interface TemporaryQuestionService {

    TemporaryQuestionEntity createTemporaryQuestion(TemporaryQuestionEntity question);

    TemporaryQuestionEntity getTemporaryQuestionById(Long id);

    List<TemporaryQuestionEntity> getAllTemporaryQuestions();

    TemporaryQuestionEntity updateTemporaryQuestion(TemporaryQuestionEntity question);

    void deleteTemporaryQuestion(Long id);
}
