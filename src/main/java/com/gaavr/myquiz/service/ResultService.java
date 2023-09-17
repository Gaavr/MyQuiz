package com.gaavr.myquiz.service;

import com.gaavr.myquiz.entity.ResultEntity;

import java.util.List;

public interface ResultService {

    ResultEntity createResult(ResultEntity result);

    ResultEntity getResultById(Long id);

    List<ResultEntity> getAllResults();

    ResultEntity updateResult(ResultEntity result);

    void deleteResult(Long id);
}
