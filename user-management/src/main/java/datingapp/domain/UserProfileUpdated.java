package datingapp.domain;

import datingapp.domain.*;
import datingapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class UserProfileUpdated extends AbstractEvent {

    private String userId;
    private String name;
    private String profileImageUrl;

    public UserProfileUpdated(User aggregate) {
        super(aggregate);
    }

    public UserProfileUpdated() {
        super();
    }
}
