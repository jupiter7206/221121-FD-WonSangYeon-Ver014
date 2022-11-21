package fdwonsangyeonver.infra;

import fdwonsangyeonver.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="메뉴판", path="메뉴판")
public interface 메뉴판Repository extends PagingAndSortingRepository<메뉴판, Long> {

    

    
}
