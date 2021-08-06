package com.gaavr.myquiz.service;

import com.gaavr.myquiz.model.RightAnswers;

import java.util.List;

public interface RightAnswersService {

    void create(RightAnswers answers);

    List<RightAnswers> readAll();

    RightAnswers read(int id);

    boolean update(RightAnswers rightAnswers, int id);

    boolean delete(int id);

    boolean deleteAll();
}
