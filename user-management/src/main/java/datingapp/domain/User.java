package datingapp.domain;

import datingapp.UserManagementApplication;
import datingapp.domain.UserCreated;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "User_table")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String userId;

    private String name;

    private String profileImageUrl;

    @PostPersist
    public void onPostPersist() {
        UserCreated userCreated = new UserCreated(this);
        userCreated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static UserRepository repository() {
        UserRepository userRepository = UserManagementApplication.applicationContext.getBean(
            UserRepository.class
        );
        return userRepository;
    }

    public void updateUserProfile(
        UpdateUserProfileCommand updateUserProfileCommand
    ) {
        //implement business logic here:

        UserProfileUpdated userProfileUpdated = new UserProfileUpdated(this);
        userProfileUpdated.publishAfterCommit();
    }
}
