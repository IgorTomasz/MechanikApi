package example.mechanikapi;

import example.mechanikapi.Configuration.SecurityConfigInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SecurityConfigInitializer.class)
public class MechanikApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MechanikApiApplication.class, args);
    }

}
