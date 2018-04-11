package com.alenasoft.urbanager.resources.arithmeticoperation.service;

import com.alenasoft.urbanager.api.Result;

public interface ArithmeticOperationService {
    long sum(int num1, int num2);

    Result getById(long id) throws Exception;
}
