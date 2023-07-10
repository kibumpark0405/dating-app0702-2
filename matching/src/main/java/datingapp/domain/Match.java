package datingapp.domain;

import datingapp.MatchingApplication;
import datingapp.domain.MatchCreated;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Match_table")
@Data
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String matchId;

    private String userId;

    private List<String> interests;

    @PostPersist
    public void onPostPersist() {
        MatchCreated matchCreated = new MatchCreated(this);
        matchCreated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static MatchRepository repository() {
        MatchRepository matchRepository = MatchingApplication.applicationContext.getBean(
            MatchRepository.class
        );
        return matchRepository;
    }
}
