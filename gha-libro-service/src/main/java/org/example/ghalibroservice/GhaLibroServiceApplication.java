package org.example.ghalibroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GhaLibroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GhaLibroServiceApplication.class, args);
    }

}
