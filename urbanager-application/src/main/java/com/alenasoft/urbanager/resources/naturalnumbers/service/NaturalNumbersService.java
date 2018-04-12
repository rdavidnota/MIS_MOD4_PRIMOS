package com.alenasoft.urbanager.resources.naturalnumbers.service;

/**
 * Created by rnota on 10/04/2018.
 */
public interface NaturalNumbersService {
    NaturalNumbersService.Result isAPrimeNumber(int number);

    enum Result {OK, FAIL}
}