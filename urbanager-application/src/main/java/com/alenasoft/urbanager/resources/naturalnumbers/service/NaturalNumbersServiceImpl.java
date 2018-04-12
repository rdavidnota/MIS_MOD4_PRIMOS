package com.alenasoft.urbanager.resources.naturalnumbers.service;

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

    private NaturalNumbersService.Result convertBooleanToResult(boolean flag) {
        return flag == false ? Result.OK : Result.FAIL;
    }


}
