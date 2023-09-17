package com.gaavr.myquiz.service;

import com.gaavr.myquiz.entity.DeskEntity;

import java.util.List;

public interface DeskService {

    DeskEntity createDesk(DeskEntity user);

    DeskEntity getDeskById(Long id);

    List<DeskEntity> getAllDesks();

    DeskEntity updateDesk(DeskEntity user);

    void deleteDesk(Long id);
}
