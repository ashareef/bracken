package io.shareef.azher.bracken.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Tournament {

    @GeneratedValue @Id
    private Long id;
    private String name;

}
