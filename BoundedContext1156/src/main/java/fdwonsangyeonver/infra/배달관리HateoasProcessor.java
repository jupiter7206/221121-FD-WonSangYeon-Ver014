package fdwonsangyeonver.infra;
import fdwonsangyeonver.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class 배달관리HateoasProcessor implements RepresentationModelProcessor<EntityModel<배달관리>>  {

    @Override
    public EntityModel<배달관리> process(EntityModel<배달관리> model) {

        
        return model;
    }
    
}
