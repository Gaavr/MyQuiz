package com.gaavr.myquiz.conttrollers;

import com.gaavr.myquiz.model.Tables;
import com.gaavr.myquiz.service.TablesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TablesController {

    private final TablesService tablesService;

    @Autowired
    public TablesController(TablesService tablesService) { this.tablesService = tablesService; }

    @PostMapping(value = "/tables")
    public ResponseEntity<?> create(@RequestBody Tables tables) {
        tablesService.create(tables);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/tables")
    public ResponseEntity<List<Tables>> read() {
        final List<Tables> tables = tablesService.readAll();
        return tables != null && !tables.isEmpty()
                ? new ResponseEntity<>(tables, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/tables/{id}")
    public ResponseEntity<Tables> read(@PathVariable(name = "id") String id) {
        final Tables tables = tablesService.read(id);
        return tables != null
                ? new ResponseEntity<>(tables, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/tables/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") String id, @RequestBody Tables tables ) {
        final boolean updated = tablesService.update(tables, id);
        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/tables/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") String id) {
        final boolean deleted = tablesService.delete(id);
        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}
