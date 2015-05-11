package com.cohesiva.deserialize.web.model;

import com.cohesiva.deserialize.web.service.ZooService;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 *
 * @author Mariusz
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
public interface Animal {

    String getName();
    
    void lockIn(ZooService zoo);
}
