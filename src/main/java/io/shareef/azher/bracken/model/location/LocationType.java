package io.shareef.azher.bracken.model.location;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
public class LocationType {

    @GeneratedValue @Id
    private Long id;

}
