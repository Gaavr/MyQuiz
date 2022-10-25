package com.gaavr.myquiz.serviceIml;

import com.gaavr.myquiz.model.Tables;
import com.gaavr.myquiz.repository.TablesRepository;
import com.gaavr.myquiz.service.TablesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TableServiceImpl implements TablesService {

    @Autowired
    private TablesRepository tablesRepository;

    @Override
    public void create(Tables tables) {
        tablesRepository.save(tables);
    }

    @Override
    public Tables read(UUID id) {
        return tablesRepository.findById(id).get();
    }

    @Override
    public List<Tables> readAll() {
        return tablesRepository.findAll();
    }

    @Override
    public boolean update(Tables tables, UUID id) {
        if (tablesRepository.existsById(id)) {
            tables.setId(id);
            tablesRepository.save(tables);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(UUID id) {
        if (tablesRepository.existsById(id)) {
            tablesRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteAll() {
        try {
            tablesRepository.deleteAll();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
