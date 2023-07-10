package datingapp.domain;

import datingapp.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "securities",
    path = "securities"
)
public interface SecurityRepository
    extends PagingAndSortingRepository<Security, String> {}
