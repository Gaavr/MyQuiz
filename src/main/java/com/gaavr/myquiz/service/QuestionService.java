package com.gaavr.myquiz.service;

import com.gaavr.myquiz.model.Question;

import java.util.List;
import java.util.UUID;

public interface QuestionService {

    void create(Question question);

    List<Question> readAll();

    Question read(UUID id);

    boolean update(Question question, UUID id);

    boolean delete(UUID id);

    boolean deleteAll();
}
