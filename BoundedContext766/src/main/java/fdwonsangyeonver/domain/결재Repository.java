package fdwonsangyeonver.domain;

import fdwonsangyeonver.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="결재", path="결재")
public interface 결재Repository extends PagingAndSortingRepository<결재, Long>{

}
