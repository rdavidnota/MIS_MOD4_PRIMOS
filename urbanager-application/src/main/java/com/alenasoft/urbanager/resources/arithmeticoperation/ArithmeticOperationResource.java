package com.alenasoft.urbanager.resources.arithmeticoperation;

import ch.qos.logback.core.status.Status;
import com.alenasoft.urbanager.api.Result;
import com.alenasoft.urbanager.resources.arithmeticoperation.service.ArithmeticOperationService;
import io.dropwizard.hibernate.UnitOfWork;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.sql.SQLException;

@Path(ArithmeticOperationResource.NAME)

@Api(value = ArithmeticOperationResource.NAME, description = "Arithmetic operations resource")
public class ArithmeticOperationResource {

    protected static final String NAME = "arithmeticoperation";

    @Inject
    private ArithmeticOperationService service;

    @POST
    @UnitOfWork
    @Path("{number1}/{number2}")
    @Consumes(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Sum and create the result of the operation sum")
    @ApiResponse(code = 201, message = "Sum and create the numbers")
    public Response sumNumbers(@PathParam("number1") int number1,
                               @PathParam("number2") int number2) {
        try {
            long idCreated = this.service.sum(number1, number2);
            String resourcePath = String.format("./%s/%d", ArithmeticOperationResource.NAME, idCreated);
            return Response.created(URI.create(resourcePath)).build();
        } catch (Exception ex) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }

    @GET
    @UnitOfWork
    @Path("{id}")
    @ApiOperation(value = "Get operation by id", response = Result.class)
    @ApiResponse(code = 200, message = "Returns the result found by id")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getById(@PathParam("id") int id) {
        try {
            Result result = this.service.getById(id);

            return Response.ok(result).build();
        } catch (Exception ex) {
            return Response.noContent().build();
        }

    }
}

