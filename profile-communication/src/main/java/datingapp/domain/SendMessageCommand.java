package datingapp.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class SendMessageCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String communicationId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String userId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String message;
}
