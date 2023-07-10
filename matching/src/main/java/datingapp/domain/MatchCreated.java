package datingapp.domain;

import datingapp.domain.*;
import datingapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class MatchCreated extends AbstractEvent {

    private String matchId;
    private String userId;
    private List<String> interests;

    public MatchCreated(Match aggregate) {
        super(aggregate);
    }

    public MatchCreated() {
        super();
    }
}
