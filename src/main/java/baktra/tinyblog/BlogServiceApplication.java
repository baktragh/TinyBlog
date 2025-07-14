package baktra.tinyblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
    public class BlogServiceApplication {

        public static void main(String[] args) {
            System.out.println(BlogServiceApplication.class.getName()+" Application started");
            SpringApplication.run(BlogServiceApplication.class, args);
        }

    }

