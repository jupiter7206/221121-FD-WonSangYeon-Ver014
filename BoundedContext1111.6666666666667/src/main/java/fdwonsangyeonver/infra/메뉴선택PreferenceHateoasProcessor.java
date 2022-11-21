package fdwonsangyeonver.infra;
import fdwonsangyeonver.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class 메뉴선택PreferenceHateoasProcessor implements RepresentationModelProcessor<EntityModel<메뉴선택Preference>>  {

    @Override
    public EntityModel<메뉴선택Preference> process(EntityModel<메뉴선택Preference> model) {

        
        return model;
    }
    
}
