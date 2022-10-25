package com.gaavr.myquiz.conttrollers.contracts;

import com.gaavr.myquiz.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;
import java.util.UUID;

@Api(tags = "Пользователи")
@EnableSwagger2
public interface UserContract {

    @ApiOperation("Создание пользователя")
    @PostMapping(value = "/user")
    ResponseEntity<?> create(@RequestBody User user);

    @ApiOperation("Получение списка пользователей")
    @GetMapping(value = "/user")
    ResponseEntity<List<User>> read();

    @ApiOperation("Получение пользователя")
    @GetMapping(value = "/user/{id}")
    ResponseEntity<User> read(@PathVariable(name = "id") UUID id);

    @ApiOperation("Изменения пользователя")
    @PutMapping(value = "/user/{id}")
    ResponseEntity<?> update(@PathVariable(name = "id") UUID id, @RequestBody User user);

    @ApiOperation("Удаление пользователя")
    @DeleteMapping(value = "/user/{id}")
    ResponseEntity<?> delete(@PathVariable(name = "id") UUID id);
}
