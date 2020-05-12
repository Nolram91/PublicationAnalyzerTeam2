package Backend.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class StartBackend {

    public static void main(String[] args) {
        SpringApplication.run(StartBackend.class, args);
    }

}
