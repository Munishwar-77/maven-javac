package com.example;

public class App {
    public static String greeting(String name) {
        if (name == null || name.isBlank()) return "Hello, World!";
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(greeting(args.length > 0 ? args[0] : "World"));
    }
}
