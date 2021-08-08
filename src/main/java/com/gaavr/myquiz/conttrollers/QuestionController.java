package com.gaavr.myquiz.conttrollers;

import com.gaavr.myquiz.model.Question;
import com.gaavr.myquiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionController {

    private final QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) { this.questionService = questionService; }

    @PostMapping(value = "/question")
    public ResponseEntity<?> create(@RequestBody Question question) {
        questionService.create(question);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/questions")
    public ResponseEntity<List<Question>> read() {
        final List<Question> questions = questionService.readAll();
        return questions != null && !questions.isEmpty()
                ? new ResponseEntity<>(questions, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/question/{id}")
    public ResponseEntity<Question> read(@PathVariable(name = "id") int id) {
        final Question question = questionService.read(id);
        return question != null
                ? new ResponseEntity<>(question, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/question/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody Question question) {
        final boolean updated = questionService.update(question, id);
        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/question/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
        final boolean deleted = questionService.delete(id);
        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}
