package com.gaavr.myquiz.conttrollers.contracts;

import com.gaavr.myquiz.model.Question;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;
import java.util.UUID;
@Api(tags = "Вопросы для пользователей")
@EnableSwagger2
public interface QuestionsContract {

    @ApiOperation("Добавление вопроса")
    @PostMapping(value = "/question")
    ResponseEntity<?> create(@RequestBody Question question);

    @ApiOperation("Получение списка всех вопросов")
    @GetMapping(value = "/questions")
    ResponseEntity<List<Question>> read();

    @ApiOperation("Получение вопроса по id")
    @GetMapping(value = "/question/{id}")
    ResponseEntity<Question> read(@PathVariable(name = "id") UUID id);

    @ApiOperation("Изменение вопроса по id")
    @PutMapping(value = "/question/{id}")
    ResponseEntity<?> update(@PathVariable(name = "id") UUID id, @RequestBody Question question);

    @ApiOperation("Удаление вопроса по id")
    @DeleteMapping(value = "/question/{id}")
    ResponseEntity<?> delete(@PathVariable(name = "id") UUID id);
}
