package bootcamp.tuxtum.java.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExternalApiController {

    @Autowired
    private UserGateway userGateway;

    @GetMapping("/call/{id}")
    public UserResponse callUserExtApi(@PathVariable int id) {
        return userGateway.getUserById(id);
    }

}
