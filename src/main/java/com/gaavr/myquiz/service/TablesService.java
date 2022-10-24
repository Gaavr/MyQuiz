package com.gaavr.myquiz.service;

import com.gaavr.myquiz.model.Tables;

import java.util.List;

public interface TablesService {

    void create(Tables tables);

    Tables read(String id);

    List<Tables> readAll();

    boolean update(Tables tables, String id);

    boolean delete(String id);

    boolean deleteAll();
}
