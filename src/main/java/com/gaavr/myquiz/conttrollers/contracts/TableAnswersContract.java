package com.gaavr.myquiz.conttrollers.contracts;

import com.gaavr.myquiz.model.TableAnswers;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;
import java.util.UUID;

@Api(tags = "Ответы пользователей")
@EnableSwagger2
public interface TableAnswersContract {

    @ApiOperation("Добавление ответа пользователя")
    @PostMapping(value = "/tableanswers")
    ResponseEntity<?> create(@RequestBody TableAnswers tableAnswers);

    @ApiOperation("Получение ответа пользователя")
    @GetMapping(value = "/tableanswers/{id}")
    ResponseEntity<TableAnswers> read(@PathVariable(name = "id") UUID id);

    @ApiOperation("Получение списка ответов пользователей")
    @GetMapping(value = "/tableanswers")
    ResponseEntity<List<TableAnswers>>  read();

    @ApiOperation("Изменение вопроса")
    @PutMapping(value = "/tableanswers/{id}")
    ResponseEntity<?> update(@PathVariable(name = "id") UUID id, @RequestBody TableAnswers tableAnswers);

    @ApiOperation("Удаление вопроса")
    @DeleteMapping(value = "/tableanswers/{id}")
    ResponseEntity<?> delete(@PathVariable(name = "id") UUID id);
}
