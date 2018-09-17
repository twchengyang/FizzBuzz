package com.thoughtworks;

public class FizzBuzz implements NumCondition {

    @Override
    public boolean isCondition(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    @Override
    public String out() {
        return "FizzBuzz";
    }
}
