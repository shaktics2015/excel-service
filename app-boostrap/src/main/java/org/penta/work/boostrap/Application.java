package org.penta.work.boostrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //(scanBasePackages={  "org.penta.work"})
//@PropertySource("classpath:application-h2.properties")
//@EntityScan
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
