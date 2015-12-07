package com.example.resteasy.rest;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Ron on 7-12-2015.
 */
@Path("simple")
@Named
public class SimpleResource {

    @Inject private OneRepository oneRepository;

    @GET @Produces(MediaType.APPLICATION_JSON)
    public Response getSimpleMessage(){
        SimpleObject simpleObject = new SimpleObject("voornaam", "achternaam");
        return Response.ok(simpleObject).build();
    }

    @GET
    @Path("spring")
    @Produces(MediaType.APPLICATION_XML)
    public Response getSpringMessage(){
        return Response.ok(oneRepository.getSimpleObject()).build();
    }
}
