package datingapp.domain;

import datingapp.ProfileCommunicationApplication;
import datingapp.domain.MessageSent;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Communication_table")
@Data
public class Communication {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String communicationId;

    private String userId;

    private String message;

    @PostPersist
    public void onPostPersist() {
        MessageSent messageSent = new MessageSent(this);
        messageSent.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static CommunicationRepository repository() {
        CommunicationRepository communicationRepository = ProfileCommunicationApplication.applicationContext.getBean(
            CommunicationRepository.class
        );
        return communicationRepository;
    }
}
