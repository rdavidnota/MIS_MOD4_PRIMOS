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
            throw new Exception(error_message_parameter_list_invalid);
        } else {
            int contador = 0;
            List<Integer> resultado = new ArrayList<Integer>();
            int auxiliar = 2;

            while (contador < quantity) {
                if (isAPrimeNumber(auxiliar) == Result.OK) {
                    resultado.add(auxiliar);
                    contador++;
                }
                auxiliar++;
            }

            return resultado;
        }
    }

    private NaturalNumbersService.Result convertBooleanToResult(boolean flag) {
        return flag == false ? Result.OK : Result.FAIL;
    }


}
