package com.gaavr.myquiz.controller;

import com.gaavr.myquiz.entity.GameEntity;
import com.gaavr.myquiz.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;

    @PostMapping
    public GameEntity createGame(@RequestBody GameEntity game) {
        return gameService.createGame(game);
    }

    @GetMapping("/{id}")
    public GameEntity getGameById(@PathVariable Long id) {
        return gameService.getGameById(id);
    }

    @GetMapping
    public List<GameEntity> getAllGames() {
        return gameService.getAllGames();
    }

    @PutMapping("/{id}")
    public GameEntity updateGame(@PathVariable Long id, @RequestBody GameEntity game) {
        return gameService.updateGame(game);
    }

    @DeleteMapping("/{id}")
    public void deleteGame(@PathVariable Long id) {
        gameService.deleteGame(id);
    }
}
