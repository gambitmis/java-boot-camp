package bootcamp.tuxtum.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    @DisplayName("test username = chalermsak and get Hello chalermsak")
    void case01() {
        HelloResponse result = testRestTemplate.getForObject("/hello/chalermsak",HelloResponse.class);
        Assertions.assertEquals("Hello chalermsak", result.getMessage());
    }

    @Test
    @DisplayName("test username = test and get User test not found")
    void case02() {
        HelloResponse result = testRestTemplate.getForObject("/hello/test",HelloResponse.class);
        Assertions.assertEquals("User test not found", result.getMessage());
    }
}