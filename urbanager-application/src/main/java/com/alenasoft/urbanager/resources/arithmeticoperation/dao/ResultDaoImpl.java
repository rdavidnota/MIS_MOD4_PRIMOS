package com.alenasoft.urbanager.resources.arithmeticoperation.dao;

import com.alenasoft.urbanager.api.Result;
import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;

public class ResultDaoImpl extends AbstractDAO<Result> implements ResultDao {

    protected static final String Mensaje_Error_Get_By_Id = "Error: No se encontro el result solicitado.";

    public ResultDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public long create(Result result) {
        return this.persist(result).id;
    }

    @Override
    public Result getById(long id) throws Exception {
        Result result = this.get(id);
        if (result == null) {
            throw new Exception(ResultDaoImpl.Mensaje_Error_Get_By_Id);
        }
        return result;
    }
}
