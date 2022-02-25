package bootcamp.tuxtum.java.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserGateway {

    @Autowired
    private RestTemplate restTemplate;


    public UserResponse getUserById(int id) {
        // TODO
        UserResponse response = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users/" + id, UserResponse.class);
        return response;
    }
}
