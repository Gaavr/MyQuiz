package com.gaavr.myquiz.serviceImpl;

import com.gaavr.myquiz.entity.TemporaryQuestionEntity;
import com.gaavr.myquiz.repository.TemporaryQuestionRepository;
import com.gaavr.myquiz.service.TemporaryQuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TemporaryQuestionServiceImpl implements TemporaryQuestionService {

    private TemporaryQuestionRepository temporaryQuestionRepository;

    @Override
    public TemporaryQuestionEntity createTemporaryQuestion(TemporaryQuestionEntity question) {
        return temporaryQuestionRepository.save(question);
    }

    @Override
    public TemporaryQuestionEntity getTemporaryQuestionById(Long id) {
        return temporaryQuestionRepository.findById(id).orElse(null);
    }

    @Override
    public List<TemporaryQuestionEntity> getAllTemporaryQuestions() {
        return temporaryQuestionRepository.findAll();
    }

    @Override
    public TemporaryQuestionEntity updateTemporaryQuestion(TemporaryQuestionEntity question) {
        return temporaryQuestionRepository.save(question);
    }

    @Override
    public void deleteTemporaryQuestion(Long id) {
        temporaryQuestionRepository.deleteById(id);
    }
}
