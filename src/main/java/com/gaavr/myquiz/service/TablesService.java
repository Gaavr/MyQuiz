package com.gaavr.myquiz.service;

import com.gaavr.myquiz.model.Tables;

import java.util.List;

public interface TablesService {

    void create(Tables tables);

    Tables read(int id);

    List<Tables> readAll();

    boolean update(Tables tables, int id);

    boolean delete(int id);

    boolean deleteAll();
}
