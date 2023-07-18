package com.mcsoftware.amplituderh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class SpringAmplituderhApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAmplituderhApplication.class, args);
    }

}
