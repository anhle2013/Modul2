package cleancode_and_refactor.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

class TestFizzBuzz {

    @org.junit.jupiter.api.Test
    void testFizz3() {
        int number = 3;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void testFizz6() {
        int number = 6;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void testBuzz5() {
        int number = 5;
        String expected = "Buzz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void testBuzz10() {
        int number = 10;
        String expected = "Buzz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void testFizzBuzz15() {
        int number = 15;
        String expected = "FizzBuzz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void testFizzBuzz30() {
        int number = 30;
        String expected = "FizzBuzz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
}