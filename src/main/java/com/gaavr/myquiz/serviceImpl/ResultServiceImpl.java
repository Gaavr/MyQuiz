package com.gaavr.myquiz.serviceImpl;

import com.gaavr.myquiz.entity.ResultEntity;
import com.gaavr.myquiz.repository.ResultRepository;
import com.gaavr.myquiz.service.ResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResultServiceImpl implements ResultService {

    private final ResultRepository resultRepository;

    @Override
    public ResultEntity createResult(ResultEntity result) {
        return resultRepository.save(result);
    }

    @Override
    public ResultEntity getResultById(Long id) {
        return resultRepository.findById(id).orElse(null);
    }

    @Override
    public List<ResultEntity> getAllResults() {
        return resultRepository.findAll();
    }

    @Override
    public ResultEntity updateResult(ResultEntity result) {
        return resultRepository.save(result);
    }

    @Override
    public void deleteResult(Long id) {
        resultRepository.deleteById(id);
    }
}
