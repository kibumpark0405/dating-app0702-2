package datingapp.domain;

import datingapp.domain.*;
import datingapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PrivacyLevelUpdated extends AbstractEvent {

    private String securityId;
    private String userId;
    private String privacyLevel;

    public PrivacyLevelUpdated(Security aggregate) {
        super(aggregate);
    }

    public PrivacyLevelUpdated() {
        super();
    }
}
