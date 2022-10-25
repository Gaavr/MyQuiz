package com.gaavr.myquiz.service;

import com.gaavr.myquiz.model.Tables;

import java.util.List;
import java.util.UUID;

public interface TablesService {

    void create(Tables tables);

    Tables read(UUID id);

    List<Tables> readAll();

    boolean update(Tables tables, UUID id);

    boolean delete(UUID id);

    boolean deleteAll();
}
