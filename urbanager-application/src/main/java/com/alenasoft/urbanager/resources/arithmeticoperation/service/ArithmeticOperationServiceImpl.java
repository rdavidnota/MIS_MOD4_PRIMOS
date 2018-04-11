package com.alenasoft.urbanager.resources.arithmeticoperation.service;

import com.alenasoft.urbanager.api.Result;
import com.alenasoft.urbanager.resources.arithmeticoperation.dao.ResultDaoImpl;

import javax.inject.Inject;

public class ArithmeticOperationServiceImpl implements ArithmeticOperationService {

    @Inject
    private ResultDaoImpl dao;

    @Override
    public long sum(int number1, int number2) {

        Result result = new Result();
        result.operation = "Sum";
        result.number1 = number1;
        result.number2 = number2;
        result.result = number1 + number2;

        return this.dao.create(result);
    }

    @Override
    public Result getById(long id) throws Exception {
        return this.dao.getById(id);
    }
}
