package com.gaavr.myquiz.serviceImpl;

import com.gaavr.myquiz.entity.QuestionEntity;
import com.gaavr.myquiz.repository.QuestionRepository;
import com.gaavr.myquiz.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;

    @Override
    public QuestionEntity createQuestion(QuestionEntity question) {
        return questionRepository.save(question);
    }

    @Override
    public QuestionEntity getQuestionById(Long id) {
        return questionRepository.findById(id).orElse(null);
    }

    @Override
    public List<QuestionEntity> getAllQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public QuestionEntity updateQuestion(QuestionEntity question) {
        return questionRepository.save(question);
    }

    @Override
    public void deleteQuestion(Long id) {
        questionRepository.deleteById(id);
    }
}
