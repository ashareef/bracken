package io.shareef.azher.bracken.model.tournament;

import io.shareef.azher.bracken.model.participant.Person;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Competition {

    @GeneratedValue @Id
    private Long id;
    private String name;
    private Person owner;
    @OneToMany
    private List<Tournament> tournaments;

}
