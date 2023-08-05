package com.example.tdddemoapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TddDemoAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println("start");
        SpringApplication.run(TddDemoAppApplication.class, args);
        String temp = "temp";
        System.out.println("finish");
    }

    @Override
    public void run(String... args) throws Exception {
        List<String> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        String text = String.valueOf(sum);
        String result = text + LocalDateTime.now();
        list.addAll(List.of(text, result));
        System.out.println(result);
    }
}
