package com.gaavr.myquiz.serviceIml;

import com.gaavr.myquiz.model.RightAnswers;
import com.gaavr.myquiz.repository.RightAnswersRepository;
import com.gaavr.myquiz.service.RightAnswersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RightAnswersServiceImpl implements RightAnswersService {

    @Autowired
    private RightAnswersRepository rightAnswersRepository;

    @Override
    public void create(RightAnswers answers) {
        rightAnswersRepository.save(answers);
    }

    @Override
    public List<RightAnswers> readAll() {
        return rightAnswersRepository.findAll();
    }

    @Override
    public RightAnswers read(String id) {
        return rightAnswersRepository.findById(id).get();
    }

    @Override
    public boolean update(RightAnswers rightAnswers, String id) {
        if (rightAnswersRepository.existsById(id)) {
            rightAnswers.setId(id);
            rightAnswersRepository.save(rightAnswers);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        if (rightAnswersRepository.existsById(id)) {
            rightAnswersRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteAll() {
        try {
            rightAnswersRepository.deleteAll();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
