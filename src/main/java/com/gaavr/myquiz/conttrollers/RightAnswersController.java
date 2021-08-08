package com.gaavr.myquiz.conttrollers;

import com.gaavr.myquiz.model.RightAnswers;
import com.gaavr.myquiz.service.RightAnswersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RightAnswersController {

    private final RightAnswersService rightAnswersService;

    @Autowired
    public RightAnswersController(RightAnswersService rightAnswersService) {
        this.rightAnswersService = rightAnswersService;
    }

    @PostMapping(value = "/rightanswers")
    public ResponseEntity<?> create(@RequestBody RightAnswers rightAnswers) {
        rightAnswersService.create(rightAnswers);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/rightanswers")
    public ResponseEntity<List<RightAnswers>> read() {
        final List<RightAnswers> rightAnswers = rightAnswersService.readAll();
        return rightAnswers != null && !rightAnswers.isEmpty()
                ? new ResponseEntity<>(rightAnswers, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/rightanswers/{id}")
    public ResponseEntity<RightAnswers> read(@PathVariable(name = "id") int id) {
        final RightAnswers rightAnswers = rightAnswersService.read(id);
        return rightAnswers != null
                ? new ResponseEntity<>(rightAnswers, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/rightanswers/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody RightAnswers rightAnswers) {
        final boolean updated = rightAnswersService.update(rightAnswers, id);
        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/rightanswers/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
        final boolean deleted = rightAnswersService.delete(id);
        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}