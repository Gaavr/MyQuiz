package com.gaavr.myquiz.conttrollers.contracts;

import com.gaavr.myquiz.model.Tables;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;
import java.util.UUID;

@Api(tags = "Столы с игроками")
@EnableSwagger2
public interface TablesContract {

    @ApiOperation("Создание стола для игроков")
    @PostMapping(value = "/tables")
    public ResponseEntity<?> create(@RequestBody Tables tables);

    @ApiOperation("Получение списка столов")
    @GetMapping(value = "/tables")
    public ResponseEntity<List<Tables>> read();

    @ApiOperation("Получение стола")
    @GetMapping(value = "/tables/{id}")
    public ResponseEntity<Tables> read(@PathVariable(name = "id") UUID id);

    @ApiOperation("Изменение данных стола")
    @PutMapping(value = "/tables/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") UUID id, @RequestBody Tables tables );

    @ApiOperation("Удаление стола")
    @DeleteMapping(value = "/tables/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") UUID id);
}
