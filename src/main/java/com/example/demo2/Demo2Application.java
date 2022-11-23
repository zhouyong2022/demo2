package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }

    private static void hello() {
        System.out.println("Hello");
    }

    private static void world() {
        System.out.println("World");
    }

    private static void zhou() {
        System.out.println("Zhou");
    }

    private static void yong() {
        System.out.println("Yong");
    }

    private static void zhang() {
        System.out.println("Zhang");
    }

}
