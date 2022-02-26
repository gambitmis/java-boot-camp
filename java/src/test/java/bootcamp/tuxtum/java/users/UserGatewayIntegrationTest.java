package bootcamp.tuxtum.java.users;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(
        webEnvironment = WebEnvironment.RANDOM_PORT
)
class UserGatewayIntegrationTest {
    @Autowired
    private UserGateway userGateway;

    UserGatewayIntegrationTest() {
    }

    @Test
    void getUserById() {
        UserResponse res = this.userGateway.getUserById(1);
        Assertions.assertEquals(1, res.getId());
        Assertions.assertEquals("Leanne Graham", res.getName());
    }
}
