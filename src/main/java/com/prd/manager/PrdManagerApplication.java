package com.prd.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class PrdManagerApplication {

    public static void main(String[] args) {

        SpringApplication.run(PrdManagerApplication.class, args);
    }

}
