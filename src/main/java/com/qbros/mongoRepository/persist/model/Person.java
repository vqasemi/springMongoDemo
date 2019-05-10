package com.qbros.mongoRepository.persist.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by QBros on Zero Hour ... Hooah!
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Person {

    @Id
    int id;
    private String name;
    private String lastName;
    int age;
}
