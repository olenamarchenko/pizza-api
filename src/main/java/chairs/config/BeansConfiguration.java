package chairs.config;

import chairs.Database;
import chairs.DefaultDB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"chairs.dao"})
public class BeansConfiguration {

    @Bean
    Database db() {
        return  new DefaultDB();
    }

}
