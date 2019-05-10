package com.qbros.mongoRepository.persist.repository;

import com.qbros.mongoRepository.persist.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by QBros on Zero Hour ... Hooah!
 */
@Repository
public interface PersonRepo extends MongoRepository<Person, Integer> {
}
