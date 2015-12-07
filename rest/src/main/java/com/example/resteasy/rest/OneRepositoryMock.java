package com.example.resteasy.rest;

import org.springframework.stereotype.Service;

/**
 * Created by Ron on 7-12-2015.
 */
@Service
public class OneRepositoryMock implements OneRepository {
    @Override
    public SimpleObject getSimpleObject() {
        return new SimpleObject("komt uit", "SPRING");
    }
}
