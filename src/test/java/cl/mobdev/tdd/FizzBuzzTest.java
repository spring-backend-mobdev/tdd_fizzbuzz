package cl.mobdev.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    private FizzBuzz fizzBuzz;
    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    @DisplayName("")
    void should_return_correct_output_for_input() {
        String expected = "1";
        String response = fizzBuzz.convert(1);
        assertEquals(expected, response);
    }

    @Test
    void should_return_fizz_when_input_is_multiple_by_3() {
        String expected = "Fizz";
        String response = fizzBuzz.convert(3);
        assertEquals(expected, response);
    }

    @Test
    void should_return_buzz_when_input_is_multiple_by_5() {
        String expected = "Buzz";
        String response = fizzBuzz.convert(5);
        assertEquals(expected, response);
    }

    @Test
    void should_return_fizzbuzz_when_input_is_multiple_by_3_and_5() {
        String expected = "FizzBuzz";
        String response = fizzBuzz.convert(15);
        assertEquals(expected, response);
    }
}