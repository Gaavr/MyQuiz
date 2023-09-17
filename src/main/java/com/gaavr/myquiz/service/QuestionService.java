package com.gaavr.myquiz.service;

import com.gaavr.myquiz.entity.QuestionEntity;

import java.util.List;

public interface QuestionService {

    QuestionEntity createQuestion(QuestionEntity question);

    QuestionEntity getQuestionById(Long id);

    List<QuestionEntity> getAllQuestions();

    QuestionEntity updateQuestion(QuestionEntity question);

    void deleteQuestion(Long id);
}
