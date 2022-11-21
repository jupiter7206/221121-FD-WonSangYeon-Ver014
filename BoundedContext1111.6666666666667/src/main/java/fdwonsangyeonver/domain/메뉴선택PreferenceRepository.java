package fdwonsangyeonver.domain;

import fdwonsangyeonver.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="메뉴선택Preferences", path="메뉴선택Preferences")
public interface 메뉴선택PreferenceRepository extends PagingAndSortingRepository<메뉴선택Preference, Long>{

}
