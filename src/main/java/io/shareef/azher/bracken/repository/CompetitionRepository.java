package io.shareef.azher.bracken.repository;

import io.shareef.azher.bracken.model.tournament.Sport;
import io.swagger.annotations.Api;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Api(tags = "Competition Entity")
@RepositoryRestResource(collectionResourceRel = "competitions", path = "competitions")
public interface CompetitionRepository extends PagingAndSortingRepository<Sport, Long> {

}
