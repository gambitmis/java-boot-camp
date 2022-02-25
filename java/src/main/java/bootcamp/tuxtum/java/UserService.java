package bootcamp.tuxtum.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String concatData(String name){
        Optional<User> result = userRepository.findByName(name);
        return "Hello "+ result.get().getName();
    }
}
