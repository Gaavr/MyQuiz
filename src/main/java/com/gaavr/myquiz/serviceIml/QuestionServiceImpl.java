package com.gaavr.myquiz.serviceIml;

import com.gaavr.myquiz.model.Question;
import com.gaavr.myquiz.repository.QuestionRepository;
import com.gaavr.myquiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public void create(Question question) {
        questionRepository.save(question);
    }

    @Override
    public List<Question> readAll() {
        return questionRepository.findAll();
    }

    @Override
    public Question read(int id) {
        return questionRepository.findById(id).get();
    }

    @Override
    public boolean update(Question question, int id) {
        if (questionRepository.existsById(id)) {
            question.setId(id);
            questionRepository.save(question);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        if (questionRepository.existsById(id)) {
            questionRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteAll() {
        try {
            questionRepository.deleteAll();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
