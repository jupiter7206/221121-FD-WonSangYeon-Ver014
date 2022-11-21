package fdwonsangyeonver.infra;
import fdwonsangyeonver.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class 결재HateoasProcessor implements RepresentationModelProcessor<EntityModel<결재>>  {

    @Override
    public EntityModel<결재> process(EntityModel<결재> model) {

        
        return model;
    }
    
}
