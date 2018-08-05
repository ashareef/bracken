package io.shareef.azher.bracken.model.participant;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Team {

    @GeneratedValue @Id
    private Long id;
    private String name;
    @OneToMany
    private List<Player> players;

}
