package com.gaavr.myquiz.serviceImpl;

import com.gaavr.myquiz.entity.GameEntity;
import com.gaavr.myquiz.repository.GameRepository;
import com.gaavr.myquiz.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameServiceImpl implements GameService {

    private final GameRepository gameRepository;

    @Override
    public GameEntity createGame(GameEntity game) {
        return gameRepository.save(game);
    }

    @Override
    public GameEntity getGameById(Long id) {
        return gameRepository.findById(id).orElse(null);
    }

    @Override
    public List<GameEntity> getAllGames() {
        return gameRepository.findAll();
    }

    @Override
    public GameEntity updateGame(GameEntity game) {
        return gameRepository.save(game);
    }

    @Override
    public void deleteGame(Long id) {
        gameRepository.deleteById(id);
    }
}
