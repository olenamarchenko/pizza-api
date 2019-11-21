package unittests.configuration;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import chairs.Database;

@Configuration
@ComponentScan(basePackages = {"chairs.dao"})
public class BeansTestConfiguration {

    @Bean
    Database mockDB(){
        Database mock = mock(Database.class);
        when(mock.saveChair(40)).thenReturn(false);
        when(mock.saveChair(41)).thenReturn(true);
        when(mock.updateChair(30)).thenReturn(false);
        when(mock.updateChair(31)).thenReturn(true);
        return mock;
    }

}
