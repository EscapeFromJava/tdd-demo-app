package com.example.tdddemoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TddDemoAppApplication {

    public static void main(String[] args) {
        System.out.println("start");
        SpringApplication.run(TddDemoAppApplication.class, args);
        System.out.println("finish");
    }

}
