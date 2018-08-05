package io.shareef.azher.bracken.model.tournament;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Data
@Entity
public class Match {

    @GeneratedValue @Id
    private Long id;
    private List<Game> games;

}
