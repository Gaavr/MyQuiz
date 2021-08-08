package com.gaavr.myquiz.serviceIml;

import com.gaavr.myquiz.model.TableAnswers;
import com.gaavr.myquiz.repository.TableAnswersRepository;
import com.gaavr.myquiz.service.TableAnswersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableAnswersServiceImpl implements TableAnswersService {

    @Autowired
    private TableAnswersRepository tableAnswersRepository;

    @Override
    public void create(TableAnswers tableAnswers) {
        tableAnswersRepository.save(tableAnswers);
    }

    @Override
    public TableAnswers read(int id) {
        return tableAnswersRepository.findById(id).get();
    }

    @Override
    public List<TableAnswers> readAll() {
        return tableAnswersRepository.findAll();
    }

    @Override
    public boolean update(TableAnswers tableAnswers, int id) {
        if (tableAnswersRepository.existsById(id)) {
            tableAnswers.setId(id);
            tableAnswersRepository.save(tableAnswers);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        if (tableAnswersRepository.existsById(id)) {
            tableAnswersRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
