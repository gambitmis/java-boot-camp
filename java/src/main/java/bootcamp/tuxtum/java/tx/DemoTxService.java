package bootcamp.tuxtum.java.tx;

import bootcamp.tuxtum.java.User;
import bootcamp.tuxtum.java.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DemoTxService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Service2 service2;

    @Autowired
    private Service3 service3;

    @Transactional
    public void callRepository() {
        service2.doSth();
        service3.doSth();
    }

    public void processLongRunning(){
    }

    @Transactional
    public void step1(){

        User user1 = new User(1,"user 1");
        User user2 = new User(2,"user 2");
        User user3 = new User(3,"user 3");

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
    }

    @Transactional
    public void step2(){

        User user3 = new User(3,"user 3");

        userRepository.save(user3);
        userRepository.save(user3);
        userRepository.save(user3);
    }
}
