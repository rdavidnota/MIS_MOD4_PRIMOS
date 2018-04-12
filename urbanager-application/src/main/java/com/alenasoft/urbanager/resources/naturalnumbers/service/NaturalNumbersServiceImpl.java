package com.alenasoft.urbanager.resources.naturalnumbers.service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnota on 10/04/2018.
 */
public class NaturalNumbersServiceImpl implements NaturalNumbersService {

    @Override
    public NaturalNumbersService.Result isAPrimeNumber(int number) {
        boolean flag = false;

        if (number < 2) {
            return convertBooleanToResult(flag);
        } else if (number > 1 && number < 4) {
            return convertBooleanToResult(flag);
        } else {
            int auxiliar = number / 2;

            for (int i = 2; i <= auxiliar; i++) {
                flag = flag || (number % i == 0);
            }

            return convertBooleanToResult(flag);
        }
    }

    @Override
    public List<Integer> ListNPrimeNumbers(int quantity) throws Exception {
        if (quantity < 1) {
            throw new Exception("Error la cantidad tiene que ser mayor a cero");
        } else {
            int aux = 0;
            List<Integer> resultado = new ArrayList<Integer>();
            int i = 2;
            while (aux < quantity) {
                if (isAPrimeNumber(i) == Result.OK) {
                    resultado.add(i);
                    aux++;
                }
                i++;
            }

            return resultado;
        }
    }

    private NaturalNumbersService.Result convertBooleanToResult(boolean flag) {
        return flag == false ? Result.OK : Result.FAIL;
    }


}
