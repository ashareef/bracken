package io.shareef.azher.bracken.model.participant;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Person {

    @GeneratedValue @Id
    private Long id;
    private String name;
    private String contactInfo;
    private Demographic demographic;
}
