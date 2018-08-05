package io.shareef.azher.bracken.model.tournament;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@Entity
public class GameScore {

    @GeneratedValue @Id
    private Long id;
    @OneToMany
    private Set<TeamScore> teamScores;

}
