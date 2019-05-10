package com.qbros.mongoRepository.SpringStuff;

import com.qbros.mongoRepository.persist.model.Person;
import com.qbros.mongoRepository.persist.repository.PersonRepo;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * Created by QBros on Zero Hour ... Hooah!
 *
 */


// * every class that implements command line runner will be be run by spring in the start up
@Component
@AllArgsConstructor
@ConditionalOnProperty(name = "init.db", havingValue = "yes", matchIfMissing = false )
public class Init implements CommandLineRunner {

    private PersonRepo personRepo;

    /*
        * for in memory dbs, the database schema will be created on each startup from the scratch
        *  with this default value spring.jpa.hibernate.ddl-auto=create-drop (in properties file)
        *  for other dbs we should inflate db with our data with two approaches:
        *  # 1 using code: like this file
        *  # 2 using sql schema files  (for mongo db we don't have schema so this solution is not feasible)
        * */

    @Override
    public void run(String... strings) throws Exception {
        personRepo.save(new Person(1, "Peter", "JAKson", 3000));
        personRepo.save(new Person(2, "Sam", "SAMson", 2000));
        System.out.println("init finish");
    }
}
