package datingapp.domain;

import datingapp.domain.*;
import datingapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class UserCreated extends AbstractEvent {

    private String userId;
    private String name;
    private String profileImageUrl;

    public UserCreated(User aggregate) {
        super(aggregate);
    }

    public UserCreated() {
        super();
    }
}
