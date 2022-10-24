package com.gaavr.myquiz.service;

import com.gaavr.myquiz.model.Question;

import java.util.List;

public interface QuestionService {

    void create(Question question);

    List<Question> readAll();

    Question read(String id);

    boolean update(Question question, String id);

    boolean delete(String id);

    boolean deleteAll();
}
