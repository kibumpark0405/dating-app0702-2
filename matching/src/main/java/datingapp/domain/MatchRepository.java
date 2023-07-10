package datingapp.domain;

import datingapp.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "matches", path = "matches")
public interface MatchRepository
    extends PagingAndSortingRepository<Match, String> {}
