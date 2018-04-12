package com.alenasoft.urbanager.resources.example.NaturalNumbers.service;

import com.alenasoft.urbanager.resources.naturalnumbers.service.NaturalNumbersService;
import com.alenasoft.urbanager.resources.naturalnumbers.service.NaturalNumbersServiceImpl;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import org.junit.Test;
import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by rnota on 10/04/2018.
 */
public class NaturalNumbersServiceImplTest {
    @Test
    public void testIfANaturalNumberIsAPrime() {
        NaturalNumbersService.Result expected = NaturalNumbersService.Result.OK;

        NaturalNumbersService naturalNumbersService = new NaturalNumbersServiceImpl();
        NaturalNumbersService.Result result = naturalNumbersService.isAPrimeNumber(997);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testIfANaturalNumberIsNotAPrime() {
        NaturalNumbersService.Result expected = NaturalNumbersService.Result.FAIL;

        NaturalNumbersService naturalNumbersService = new NaturalNumbersServiceImpl();
        NaturalNumbersService.Result result = naturalNumbersService.isAPrimeNumber(995);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testListThe5thPrimeNumbers() {
        List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11);
        NaturalNumbersService naturalNumbersService = new NaturalNumbersServiceImpl();
        List<Integer> result = naturalNumbersService.ListNPrimeNumbers(5);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testListThe15thPrimeNumbers() {
        List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47);
        NaturalNumbersService naturalNumbersService = new NaturalNumbersServiceImpl();
        List<Integer> result = naturalNumbersService.ListNPrimeNumbers(15);
        assertThat(result).isEqualTo(expected);
    }
}
