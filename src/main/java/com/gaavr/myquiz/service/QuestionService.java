package com.gaavr.myquiz.service;

import com.gaavr.myquiz.model.Question;

import java.util.List;

public interface QuestionService {

    void create(Question question);

    List<Question> readAll();

    Question read(int id);

    boolean update(Question question, int id);

    boolean delete(int id);

    boolean deleteAll();
}
