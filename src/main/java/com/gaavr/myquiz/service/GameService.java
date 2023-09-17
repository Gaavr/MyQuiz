package com.gaavr.myquiz.service;

import com.gaavr.myquiz.entity.GameEntity;

import java.util.List;

public interface GameService {

    GameEntity createGame(GameEntity game);

    GameEntity getGameById(Long id);

    List<GameEntity> getAllGames();

    GameEntity updateGame(GameEntity game);

    void deleteGame(Long id);
}
