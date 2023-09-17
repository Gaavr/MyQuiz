package com.gaavr.myquiz.controller;

import com.gaavr.myquiz.entity.DeskEntity;
import com.gaavr.myquiz.service.DeskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tables")
@RequiredArgsConstructor
public class DeskController {

    private final DeskService deskService;

    @PostMapping
    public DeskEntity createTable(@RequestBody DeskEntity table) {
        return deskService.createDesk(table);
    }

    @GetMapping("/{id}")
    public DeskEntity getTableById(@PathVariable Long id) {
        return deskService.getDeskById(id);
    }

    @GetMapping
    public List<DeskEntity> getAllTables() {
        return deskService.getAllDesks();
    }

    @PutMapping("/{id}")
    public DeskEntity updateTable(@PathVariable Long id, @RequestBody DeskEntity table) {
        return deskService.updateDesk(table);
    }

    @DeleteMapping("/{id}")
    public void deleteTable(@PathVariable Long id) {
        deskService.deleteDesk(id);
    }
}
