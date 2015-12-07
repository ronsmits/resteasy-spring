package com.example.resteasy.rest;

import javax.inject.Named;

/**
 * Created by Ron on 7-12-2015.
 */
@Named
public class OneRepositoryMock implements OneRepository {
    @Override
    public SimpleObject getSimpleObject() {
        return new SimpleObject("komt uit", "SPRING");
    }
}
