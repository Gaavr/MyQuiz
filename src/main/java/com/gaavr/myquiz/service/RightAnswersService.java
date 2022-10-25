package com.gaavr.myquiz.service;

import com.gaavr.myquiz.model.RightAnswers;

import java.util.List;
import java.util.UUID;

public interface RightAnswersService {

    void create(RightAnswers answers);

    List<RightAnswers> readAll();

    RightAnswers read(UUID id);

    boolean update(RightAnswers rightAnswers, UUID id);

    boolean delete(UUID id);

    boolean deleteAll();
}
