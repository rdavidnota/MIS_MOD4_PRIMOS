package com.alenasoft.urbanager.resources.naturalnumbers.service;

import java.util.List;

/**
 * Created by rnota on 10/04/2018.
 */
public interface NaturalNumbersService {
    NaturalNumbersService.Result isAPrimeNumber(int number);

    List<Integer> ListNPrimeNumbers(int quantity) throws Exception;

    enum Result {OK, FAIL}

    static final String error_message_parameter_list_invalid = "Error la cantidad tiene que ser mayor a cero";
}