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

    private DeskRepository userRepository;

    @Override
    public DeskEntity createDesk(DeskEntity user) {
        return userRepository.save(user);
    }

    @Override
    public DeskEntity getDeskById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<DeskEntity> getAllDesks() {
        return userRepository.findAll();
    }

    @Override
    public DeskEntity updateDesk(DeskEntity user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteDesk(Long id) {
        userRepository.deleteById(id);
    }
}
