package io.shareef.azher.bracken.model.tournament;

import io.shareef.azher.bracken.model.participant.Referee;
import io.shareef.azher.bracken.model.participant.Spectator;
import io.shareef.azher.bracken.model.participant.Team;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Tournament {

    @GeneratedValue @Id
    private Long id;
    private String name;
    @OneToOne
    private TournamentType type;
    @OneToOne
    private Sport sport;
    @OneToMany
    private Set<Team> teams;
    @OneToMany
    private Set<Referee> referees;
    @OneToMany
    private Set<Spectator> spectators;

}
