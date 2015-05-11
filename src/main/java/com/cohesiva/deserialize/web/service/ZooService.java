package com.cohesiva.deserialize.web.service;

import com.cohesiva.deserialize.web.model.Lion;
import com.cohesiva.deserialize.web.model.Rat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mariusz
 */
@Service
public class ZooService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ZooService.class);

    public void addAnimal(Lion lion) {
        LOGGER.info("Locking lion {} with {} lioness", lion.getName(), lion.getLionessNo());
    }

    public void addAnimal(Rat rat) {
        LOGGER.info("Locking rat {}", rat.getName());
    }
}
