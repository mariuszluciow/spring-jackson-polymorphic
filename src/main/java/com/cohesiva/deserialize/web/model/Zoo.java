package com.cohesiva.deserialize.web.model;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Mariusz
 */
public class Zoo {

    private static final Logger LOGGER = LoggerFactory.getLogger(Zoo.class);

    private List<Animal> animals;

    public Zoo() {
    }

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

}
