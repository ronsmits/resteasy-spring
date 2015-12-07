package com.example.resteasy.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Ron on 7-12-2015.
 */
@Path("simple")
@Component
public class SimpleResource {

    @Autowired private OneRepository oneRepository;

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
