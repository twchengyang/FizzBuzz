package com.thoughtworks;

public class Fizz implements NumCondition {
    @Override
    public boolean isCondition(int number) {
        return number % 3 == 0;
    }

    @Override
    public String out() {
        return "Fizz";
    }
}
