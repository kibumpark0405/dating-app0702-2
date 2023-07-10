package datingapp.domain;

import datingapp.domain.*;
import datingapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class MessageSent extends AbstractEvent {

    private String communicationId;
    private String userId;
    private String message;

    public MessageSent(Communication aggregate) {
        super(aggregate);
    }

    public MessageSent() {
        super();
    }
}
