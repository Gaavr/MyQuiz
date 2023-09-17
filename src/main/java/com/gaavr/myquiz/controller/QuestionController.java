package com.gaavr.myquiz.controller;

import com.gaavr.myquiz.entity.QuestionEntity;
import com.gaavr.myquiz.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @PostMapping
    public QuestionEntity createQuestion(@RequestBody QuestionEntity question) {
        return questionService.createQuestion(question);
    }

    @GetMapping("/{id}")
    public QuestionEntity getQuestionById(@PathVariable Long id) {
        return questionService.getQuestionById(id);
    }

    @GetMapping
    public List<QuestionEntity> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @PutMapping("/{id}")
    public QuestionEntity updateQuestion(@PathVariable Long id, @RequestBody QuestionEntity question) {
        question.setId(id);
        return questionService.updateQuestion(question);
    }

    @DeleteMapping("/{id}")
    public void deleteQuestion(@PathVariable Long id) {
        questionService.deleteQuestion(id);
    }
}
