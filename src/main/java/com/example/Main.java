package com.example;

import java.util.Random;
import java.util.function.IntBinaryOperator;

public class Main {

    public static void main(String[] args) {
        // using a class implementing the functional interface
        Greeting greeting = new HelloGreeting();
        greeting.sayHello();

        // without an implementing class
        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello World");
            }
        };
        greeting2.sayHello();

        // using a lambda expression
        Greeting greeting3 = () -> System.out.println("Hello World");
        greeting3.sayHello();

        // using a functional interface with arguments
        Calculator calculator = (int x, int y) -> {
            Random random = new Random();
            int randomNumber = random.nextInt(50);
            return x * y + randomNumber;
        };
        System.out.println(calculator.calculate(1, 2));

        // using an existing function in java.util.function java package
        IntBinaryOperator calculator2 = (int x, int y) -> {
            Random random = new Random();
            int randomInt = random.nextInt(50);
            return x * y + randomInt;
        };
        System.out.println(calculator2.applyAsInt(1, 2));


    }

}
