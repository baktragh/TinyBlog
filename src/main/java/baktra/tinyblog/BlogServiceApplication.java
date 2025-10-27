package baktra.tinyblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class BlogServiceApplication {

        public static void main(String[] args) {
            System.out.println(BlogServiceApplication.class.getName()+" Application started");
            SpringApplication.run(BlogServiceApplication.class);
        }
    }



