package com.gaavr.myquiz.service;

import com.gaavr.myquiz.model.RightAnswers;

import java.util.List;

public interface RightAnswersService {

    void create(RightAnswers answers);

    List<RightAnswers> readAll();

    RightAnswers read(String id);

    boolean update(RightAnswers rightAnswers, String id);

    boolean delete(String id);

    boolean deleteAll();
}
