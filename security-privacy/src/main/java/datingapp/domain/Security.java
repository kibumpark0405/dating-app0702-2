package datingapp.domain;

import datingapp.SecurityPrivacyApplication;
import datingapp.domain.PrivacyLevelUpdated;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Security_table")
@Data
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String securityId;

    private String userId;

    private String privacyLevel;

    @PostPersist
    public void onPostPersist() {
        PrivacyLevelUpdated privacyLevelUpdated = new PrivacyLevelUpdated(this);
        privacyLevelUpdated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static SecurityRepository repository() {
        SecurityRepository securityRepository = SecurityPrivacyApplication.applicationContext.getBean(
            SecurityRepository.class
        );
        return securityRepository;
    }
}
