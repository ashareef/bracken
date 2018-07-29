package io.shareef.azher.bracken.repository;

import io.shareef.azher.bracken.model.Tournament;
import io.swagger.annotations.Api;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Api(tags = "Tournament Entity")
@RepositoryRestResource(collectionResourceRel = "tournaments", path = "tournaments")
public interface TournamentRepository extends PagingAndSortingRepository<Tournament, Long> {

}
