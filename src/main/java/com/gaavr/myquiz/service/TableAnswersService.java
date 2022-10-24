package com.gaavr.myquiz.service;

import com.gaavr.myquiz.model.TableAnswers;

import java.util.List;

public interface TableAnswersService {

    void create(TableAnswers tableAnswers);

    TableAnswers read(String id);

    List<TableAnswers> readAll();

    boolean update(TableAnswers tableAnswers, String id);

    boolean delete(String id);
}
