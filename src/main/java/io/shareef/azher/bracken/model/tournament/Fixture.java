package io.shareef.azher.bracken.model.tournament;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Fixture {

    @GeneratedValue @Id
    private Long id;


}
