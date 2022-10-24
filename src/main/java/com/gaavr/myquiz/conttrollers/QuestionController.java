package com.gaavr.myquiz.conttrollers;

import com.gaavr.myquiz.model.Question;
import com.gaavr.myquiz.service.QuestionService;
import io.swagger.v3.oas.annotations.tags.Tag;
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

//    @Tag(name="Добавление вопроса", description="Добавление нового вопроса в базу данных")
    @PostMapping(value = "/question")
    public ResponseEntity<?> create(@RequestBody Question question) {
        questionService.create(question);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

//    @Tag(name="Получение списка всех вопросов")
    @GetMapping(value = "/questions")
    public ResponseEntity<List<Question>> read() {
        final List<Question> questions = questionService.readAll();
        return questions != null && !questions.isEmpty()
                ? new ResponseEntity<>(questions, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

//    @Tag(name="Получение конкретного вопроса по id")
    @GetMapping(value = "/question/{id}")
    public ResponseEntity<Question> read(@PathVariable(name = "id") String id) {
        final Question question = questionService.read(id);
        return question != null
                ? new ResponseEntity<>(question, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

//    @Tag(name="Изменение вопроса по id")
    @PutMapping(value = "/question/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") String id, @RequestBody Question question) {
        final boolean updated = questionService.update(question, id);
        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

//    @Tag(name="Удаление вопроса по id")
    @DeleteMapping(value = "/question/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") String id) {
        final boolean deleted = questionService.delete(id);
        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}
