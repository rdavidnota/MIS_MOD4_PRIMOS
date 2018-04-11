package com.alenasoft.urbanager.resources.example.NaturalNumbers.service;

import com.alenasoft.urbanager.resources.naturalnumbers.service.NaturalNumbersService;
import com.alenasoft.urbanager.resources.naturalnumbers.service.NaturalNumbersServiceImpl;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by rnota on 10/04/2018.
 */
public class NaturalNumbersServiceImplTest {
    @Test
    public void testIfANaturalNumberIsAPrime() {
        String expected = "OK";

        NaturalNumbersService naturalNumbersService = new NaturalNumbersServiceImpl();
        String result = naturalNumbersService.isPrime(997);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testIfANaturalNumberIsNotAPrime() {
        String expected = "FAIL";

        NaturalNumbersService naturalNumbersService = new NaturalNumbersServiceImpl();
        String result = naturalNumbersService.isPrime(995);
        assertThat(result).isEqualTo(expected);
    }
}
