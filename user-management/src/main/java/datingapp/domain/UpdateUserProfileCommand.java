package datingapp.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class UpdateUserProfileCommand {

    private String userId;
    private String name;
    private String profileImageUrl;
}
