package com.gha.ghaconfigservidor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GhaConfigServidorApplication {

    public static void main(String[] args) {
        SpringApplication.run(GhaConfigServidorApplication.class, args);
    }

}
