package com.qbros.mongoRepository.SpringStuff;

import com.qbros.mongoRepository.persist.model.Person;
import com.qbros.mongoRepository.persist.repository.PersonRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by QBros on Zero Hour ... Hooah!
 */

//this is a more concise way, defining beans inline :)
@EnableMongoRepositories(basePackageClasses = PersonRepo.class)
@Configuration
public class InitV2 {

    @Bean
    CommandLineRunner commandLineRunner(PersonRepo personRepository) {
        return strings -> {
            System.out.println("second approach not applied");
//            personRepository.save(new Person(1, "Peter", "JAKson", 3000));
//            personRepository.save(new Person(2, "Sam", "SAMson", 2000));
        };
    }
}
