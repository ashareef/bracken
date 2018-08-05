package io.shareef.azher.bracken.model.tournament;

import io.shareef.azher.bracken.model.participant.Team;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class TeamScore {

    @GeneratedValue @Id
    private Long id;
    private Team team;
    private Long score;

}
