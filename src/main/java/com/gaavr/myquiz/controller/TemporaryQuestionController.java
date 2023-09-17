package com.gaavr.myquiz.controller;

import com.gaavr.myquiz.entity.TemporaryQuestionEntity;
import com.gaavr.myquiz.service.TemporaryQuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/temporary-questions")
@RequiredArgsConstructor
public class TemporaryQuestionController {

    private TemporaryQuestionService temporaryQuestionService;

    @PostMapping
    public TemporaryQuestionEntity createTemporaryQuestion(@RequestBody TemporaryQuestionEntity question) {
        return temporaryQuestionService.createTemporaryQuestion(question);
    }

    @GetMapping("/{id}")
    public TemporaryQuestionEntity getTemporaryQuestionById(@PathVariable Long id) {
        return temporaryQuestionService.getTemporaryQuestionById(id);
    }

    @GetMapping
    public List<TemporaryQuestionEntity> getAllTemporaryQuestions() {
        return temporaryQuestionService.getAllTemporaryQuestions();
    }

    @PutMapping("/{id}")
    public TemporaryQuestionEntity updateTemporaryQuestion(@PathVariable Long id, @RequestBody TemporaryQuestionEntity question) {
        question.setId(id);
        return temporaryQuestionService.updateTemporaryQuestion(question);
    }

    @DeleteMapping("/{id}")
    public void deleteTemporaryQuestion(@PathVariable Long id) {
        temporaryQuestionService.deleteTemporaryQuestion(id);
    }
}
