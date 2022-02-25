package bootcamp.tuxtum.java;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String concatData(String name){
        return "Hello "+ name;
    }
}
