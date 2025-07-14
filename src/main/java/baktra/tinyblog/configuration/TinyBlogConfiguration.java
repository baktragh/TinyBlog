package baktra.tinyblog.configuration;

import baktra.tinyblog.repository.BlogEntrySQLRepo;
import baktra.tinyblog.repository.DatabaseRepository;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.metamodel.Metamodel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import java.util.Map;

@Configuration
//@EnableJpaRepositories("baktra.tinyblog.repository")

public class TinyBlogConfiguration {

    @Bean
    DatabaseRepository databaseRepository() {
        return new DatabaseRepository();
    }

  //  @Bean
  //  EntityManagerFactory entityManagerFactory() {
  //      return Persistence.createEntityManagerFactory("h2");
  //
   //  }
}
