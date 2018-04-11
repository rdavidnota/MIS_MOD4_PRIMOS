package com.alenasoft.urbanager.resources.arithmeticoperation.dao;

import com.alenasoft.urbanager.api.Result;

/**
 * Created by rnota on 05/04/2018.
 */
public interface ResultDao {
    long create(Result result);

    Result getById(long id) throws Exception;
}
