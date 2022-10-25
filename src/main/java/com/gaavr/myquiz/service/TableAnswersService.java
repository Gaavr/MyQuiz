package com.gaavr.myquiz.service;

import com.gaavr.myquiz.model.TableAnswers;

import java.util.List;
import java.util.UUID;

public interface TableAnswersService {

    void create(TableAnswers tableAnswers);

    TableAnswers read(UUID id);

    List<TableAnswers> readAll();

    boolean update(TableAnswers tableAnswers, UUID id);

    boolean delete(UUID id);
}
