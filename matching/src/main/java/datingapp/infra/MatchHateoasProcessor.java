package datingapp.infra;

import datingapp.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class MatchHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Match>> {

    @Override
    public EntityModel<Match> process(EntityModel<Match> model) {
        return model;
    }
}
