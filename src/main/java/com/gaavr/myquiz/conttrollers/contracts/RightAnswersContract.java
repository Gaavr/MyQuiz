package com.gaavr.myquiz.conttrollers.contracts;

import com.gaavr.myquiz.model.RightAnswers;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;
import java.util.UUID;

@Api(tags = "Правильные ответы")
@EnableSwagger2
public interface RightAnswersContract {

    @ApiOperation("Добавление правильного ответа")
    @PostMapping(value = "/rightanswers")
    ResponseEntity<?> create(@RequestBody RightAnswers rightAnswers);

    @ApiOperation("Получение списка правильных ответов")
    @GetMapping(value = "/rightanswers")
    ResponseEntity<List<RightAnswers>> read();

    @ApiOperation("Получение правильного ответа")
    @GetMapping(value = "/rightanswers/{id}")
    ResponseEntity<RightAnswers> read(@PathVariable(name = "id") UUID id);

    @ApiOperation("Изменение правильного ответа")
    @PutMapping(value = "/rightanswers/{id}")
    ResponseEntity<?> update(@PathVariable(name = "id") UUID id, @RequestBody RightAnswers rightAnswers);

    @ApiOperation("Удаление правильного ответа")
    @DeleteMapping(value = "/rightanswers/{id}")
    ResponseEntity<?> delete(@PathVariable(name = "id") UUID id);
}
