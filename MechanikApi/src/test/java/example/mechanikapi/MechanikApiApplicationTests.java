package example.mechanikapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MechanikApiApplicationTests {

    @Autowired
    TestRestTemplate restTemplate;
    @Test
    void contextLoads() {
    }

    @Test
    void shouldHaveAccess(){
/*        ResponseEntity<String> response = restTemplate.withBasicAuth("jan","abc123").getForEntity("/klienci",String.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        response = restTemplate.withBasicAuth("kacper","qaz123").getForEntity("/wizyta",String.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);*/
        ResponseEntity<String> response = restTemplate.withBasicAuth("kacper","qaz123").getForEntity("/klienci/",String.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.FORBIDDEN);
    }
}
