package com.cohesiva.deserialize.web.controller;

import com.cohesiva.deserialize.web.service.ZooService;
import com.cohesiva.deserialize.web.model.Animal;
import com.cohesiva.deserialize.web.model.Lion;
import com.cohesiva.deserialize.web.model.Rat;
import com.cohesiva.deserialize.web.model.Zoo;
import static java.util.Arrays.asList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mariusz
 */
@RestController
public class ZooController {

    @Autowired
    ZooService zooService;

    @RequestMapping(value = "/animals", method = RequestMethod.GET)
    public List<Animal> getAnimals() {
        return asList(new Lion("Gerard", 2), new Rat("Boghdan"));
    }

    @RequestMapping(value = "/zoo", method = RequestMethod.GET)
    public Zoo getZoo() {
        return new Zoo(getAnimals());
    }

    @RequestMapping(value = "/animals/lion", method = RequestMethod.GET)
    public Animal getLion() {
        return new Lion("Gerard", 2);
    }

    @RequestMapping(value = "/animals", method = RequestMethod.POST)
    public void saveAnimal(@RequestBody Animal animal) {
        animal.lockIn(zooService);
    }
}
