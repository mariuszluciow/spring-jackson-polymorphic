package com.cohesiva.deserialize.web.model;

import com.cohesiva.deserialize.web.service.ZooService;

/**
 *
 * @author Mariusz
 */
public class Lion implements Animal {

    private String name;

    private int lionessNo;

    public Lion() {
    }

    public Lion(String name, int lionessNo) {
        this.name = name;
        this.lionessNo = lionessNo;
    }

    @Override
    public void lockIn(ZooService zoo) {
        zoo.addAnimal(this);
    }

    @Override
    public String getName() {
        return name + ", King of the Jungle";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLionessNo() {
        return lionessNo;
    }

    public void setLionessNo(int lionessNo) {
        this.lionessNo = lionessNo;
    }

}
