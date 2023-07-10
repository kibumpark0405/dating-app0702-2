package datingapp.infra;

import datingapp.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping(value="/users")
@Transactional
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(
        value = "users/{id}//users/{userId}",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public User updateUserProfile(
        @PathVariable(value = "id") String id,
        @RequestBody UpdateUserProfileCommand updateUserProfileCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /user/updateUserProfile  called #####");
        Optional<User> optionalUser = userRepository.findById(id);

        optionalUser.orElseThrow(() -> new Exception("No Entity Found"));
        User user = optionalUser.get();
        user.updateUserProfile(updateUserProfileCommand);

        userRepository.save(user);
        return user;
    }
}
