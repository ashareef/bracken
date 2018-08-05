package io.shareef.azher.bracken.model.participant;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Player {

    @GeneratedValue @Id
    private Long id;
    private Person person;

}
