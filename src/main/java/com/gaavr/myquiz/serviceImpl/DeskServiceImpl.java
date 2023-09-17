package com.gaavr.myquiz.serviceImpl;

import com.gaavr.myquiz.entity.DeskEntity;
import com.gaavr.myquiz.repository.DeskRepository;
import com.gaavr.myquiz.service.DeskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeskServiceImpl implements DeskService {

    private final DeskRepository deskRepository;

    @Override
    public DeskEntity createDesk(DeskEntity user) {
        return deskRepository.save(user);
    }

    @Override
    public DeskEntity getDeskById(Long id) {
        return deskRepository.findById(id).orElse(null);
    }

    @Override
    public List<DeskEntity> getAllDesks() {
        return deskRepository.findAll();
    }

    @Override
    public DeskEntity updateDesk(DeskEntity user) {
        return deskRepository.save(user);
    }

    @Override
    public void deleteDesk(Long id) {
        deskRepository.deleteById(id);
    }
}
