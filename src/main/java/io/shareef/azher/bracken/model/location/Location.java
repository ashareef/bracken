package io.shareef.azher.bracken.model.location;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
public class Location {

    @GeneratedValue @Id
    private Long id;
    private LocationType type;

}
