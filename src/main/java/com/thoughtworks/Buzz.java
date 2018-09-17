package com.thoughtworks;

public class Buzz implements NumCondition {
    @Override
    public boolean isCondition(int number) {
        return number % 5 == 0;
    }

    @Override
    public String out() {
        return "Buzz";
    }
}
