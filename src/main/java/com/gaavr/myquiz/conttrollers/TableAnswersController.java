package com.gaavr.myquiz.conttrollers;

import com.gaavr.myquiz.model.TableAnswers;
import com.gaavr.myquiz.service.TableAnswersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TableAnswersController {

    private final TableAnswersService tableAnswersService;

    @Autowired
    public TableAnswersController(TableAnswersService tableAnswersService) {
        this.tableAnswersService = tableAnswersService;
    }

    @PostMapping(value = "/tableanswers")
    public ResponseEntity<?> create(@RequestBody TableAnswers tableAnswers) {
        tableAnswersService.create(tableAnswers);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/tableanswers/{id}")
    public ResponseEntity<TableAnswers> read(@PathVariable(name = "id") int id) {
        final TableAnswers tableAnswers = tableAnswersService.read(id);
        return tableAnswers != null
                ? new ResponseEntity<>(tableAnswers, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/tableanswers")
    public ResponseEntity<List<TableAnswers>>  read() {
        final List<TableAnswers> tableAnswers = tableAnswersService.readAll();
        return tableAnswers != null && !tableAnswers.isEmpty()
                ? new ResponseEntity<>(tableAnswers, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/tableanswers/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody TableAnswers tableAnswers) {
        final boolean updated = tableAnswersService.update(tableAnswers, id);
        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/tableanswers/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
        final boolean deleted = tableAnswersService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}
