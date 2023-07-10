package datingapp.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateUserCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String userId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String name;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String profileImageUrl;
}
