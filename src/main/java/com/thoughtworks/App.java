package com.thoughtworks;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {
    private NumCondition[] conditions = new NumCondition[]{new FizzBuzz(), new Fizz(), new Buzz()};

    public static void main(String[] args) {

        App app = new App();

        for (int i = 1; i <= 100; i++) {

            System.out.println(app.findFizzBuzz(i));
        }

    }

    String findFizzBuzz(int value) {
        for (NumCondition condition : conditions) {
            if (condition.isCondition(value)) {
                return condition.out();
            }
        }
        return String.valueOf(value);
    }
}
