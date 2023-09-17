package com.gaavr.myquiz.controller;

import com.gaavr.myquiz.entity.ResultEntity;
import com.gaavr.myquiz.service.ResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/results")
@RequiredArgsConstructor
public class ResultController {

    private final ResultService resultService;

    @PostMapping
    public ResultEntity createResult(@RequestBody ResultEntity result) {
        return resultService.createResult(result);
    }

    @GetMapping("/{id}")
    public ResultEntity getResultById(@PathVariable Long id) {
        return resultService.getResultById(id);
    }

    @GetMapping
    public List<ResultEntity> getAllResults() {
        return resultService.getAllResults();
    }

    @PutMapping("/{id}")
    public ResultEntity updateResult(@PathVariable Long id, @RequestBody ResultEntity result) {
        result.setId(id);
        return resultService.updateResult(result);
    }

    @DeleteMapping("/{id}")
    public void deleteResult(@PathVariable Long id) {
        resultService.deleteResult(id);
    }
}
