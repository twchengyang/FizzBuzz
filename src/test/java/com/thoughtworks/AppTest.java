package com.thoughtworks;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private App app = new App();

    @Test
    public void shoud_return_Fizz_when_given_3_otherwise_return_given_number() {
        assertEquals("Fizz", app.findFizzBuzz(3));
        assertEquals("7", app.findFizzBuzz(7));
    }

    @Test
    public void shoud_return_Fizz_when_given_a_multiple_of_3_otherwise_return_given_number() {
        assertEquals("Fizz", app.findFizzBuzz(9));
        assertEquals("7", app.findFizzBuzz(7));

    }

    @Test
    public void should_return_Buzz_when_given_a_multiple_of_5_otherwise_return_given_number() {
        assertEquals("Buzz", app.findFizzBuzz(20));
        assertEquals("7", app.findFizzBuzz(7));
    }

    @Test
    public void should_return_FizzBuzz_when_given_a_multiple_of_3_and_5() {
        assertEquals("FizzBuzz", app.findFizzBuzz(15));
        assertEquals("17", app.findFizzBuzz(17));
    }
}
