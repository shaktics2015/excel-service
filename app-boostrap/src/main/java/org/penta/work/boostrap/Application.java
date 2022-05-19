package org.penta.work.boostrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*@SpringBootApplication //(scanBasePackages={  "org.penta.work"})
//@PropertySource("classpath:application-h2.properties")
//@EntityScan*/

@SpringBootApplication
@ComponentScan({"org.penta.work"})
@EntityScan("org.penta.work.jpa.entity")
@EnableJpaRepositories("org.penta.work.jpa.repository")
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
