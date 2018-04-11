package com.alenasoft.urbanager.resources.naturalnumbers.service;

/**
 * Created by rnota on 10/04/2018.
 */
public class NaturalNumbersServiceImpl implements NaturalNumbersService {
    @Override
    public String isPrime(int number) {
        boolean sw = false;

        if (number < 2) {
            return "FAIL";
        } else if (number > 1 && number < 4) {
            return "OK";
        } else {
            int auxiliar = number / 2;

            for (int i = 2; i <= auxiliar; i++) {
                sw = sw || (number % i == 0);
            }

            return sw == true ? "FAIL" : "OK";
        }
    }
}
