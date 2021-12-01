package eu.zulewski;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class PolishRedditApplication {

    public static void main(String[] args) {
        SpringApplication.run(PolishRedditApplication.class, args);
    }

}
