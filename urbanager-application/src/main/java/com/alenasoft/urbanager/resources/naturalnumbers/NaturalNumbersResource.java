package com.alenasoft.urbanager.resources.naturalnumbers;

import com.alenasoft.urbanager.resources.arithmeticoperation.ArithmeticOperationResource;
import com.alenasoft.urbanager.resources.arithmeticoperation.service.ArithmeticOperationService;
import com.alenasoft.urbanager.resources.naturalnumbers.service.NaturalNumbersService;
import io.dropwizard.hibernate.UnitOfWork;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

/**
 * Created by rnota on 10/04/2018.
 */

@Path(NaturalNumbersResource.NAME)

@Api(value = NaturalNumbersResource.NAME, description = "Natural numbers operations resource")
public class NaturalNumbersResource {
    protected static final String NAME = "naturalnumbers";

    @Inject
    private NaturalNumbersService service;

    @POST
    @UnitOfWork
    @Path("is_a_prime/{number}")
    @Consumes(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Verify if a number is a prime number")
    @ApiResponse(code = 200, message = "Verify if a number is a prime number")
    public Response isAPrimeNumber(@PathParam("number") int number) {
        try {
            NaturalNumbersService.Result result = this.service.isAPrimeNumber(number);
            return Response.ok(result).build();
        } catch (Exception ex) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }

    @POST
    @UnitOfWork
    @Path("list_nprime/{number}")
    @Consumes(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "List the N first prime numbers")
    @ApiResponse(code = 200, message = "List the N first prime numbers")
    public Response listNPrimeNumbers(@PathParam("number") int number) {
        try {
            List<Integer> result = this.service.ListNPrimeNumbers(number);
            return Response.ok(result).build();
        } catch (Exception ex) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }
}
