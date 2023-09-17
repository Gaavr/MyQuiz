package com.gaavr.myquiz.controller;

import com.gaavr.myquiz.entity.DeskEntity;
import com.gaavr.myquiz.service.DeskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/desks")
@RequiredArgsConstructor
public class DeskController {

    private final DeskService deskService;

    @PostMapping
    public DeskEntity createDesk(@RequestBody DeskEntity table) {
        return deskService.createDesk(table);
    }

    @GetMapping("/{id}")
    public DeskEntity getDeskById(@PathVariable Long id) {
        return deskService.getDeskById(id);
    }

    @GetMapping
    public List<DeskEntity> getAllDesks() {
        return deskService.getAllDesks();
    }

    @PutMapping("/{id}")
    public DeskEntity updateDesk(@PathVariable Long id, @RequestBody DeskEntity table) {
        return deskService.updateDesk(table);
    }

    @DeleteMapping("/{id}")
    public void deleteDesk(@PathVariable Long id) {
        deskService.deleteDesk(id);
    }
}
