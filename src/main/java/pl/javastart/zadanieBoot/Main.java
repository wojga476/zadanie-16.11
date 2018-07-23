package pl.javastart.zadanieBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.javastart.zadanieBoot.SmartHome.SmartHome;

@ComponentScan
@Configuration
@SpringBootApplication
public class Main {


    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(Main.class, args);
        SmartHome smartHome = configurableApplicationContext.getBean(SmartHome.class);
        smartHome.run();

    }


}
