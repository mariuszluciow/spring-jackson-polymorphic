package com.cohesiva.deserialize.web.model;

import com.cohesiva.deserialize.web.service.ZooService;

/**
 *
 * @author Mariusz
 */
public class Rat implements Animal {

    private String name;

    public Rat() {
    }

    public Rat(String name) {
        this.name = name;
    }

    @Override
    public void lockIn(ZooService zoo) {
        zoo.addAnimal(this);
    }

    @Override
    public String getName() {
        return name + ", One of many";
    }

    public void setName(String name) {
        this.name = name;
    }

}
