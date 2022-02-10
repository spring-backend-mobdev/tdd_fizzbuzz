package cl.mobdev.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PruebaTDDTest {

    private PruebaTDD pruebaTDD;

    @BeforeEach
    void setUp() {
        pruebaTDD = new PruebaTDD();
    }

    @Test
    void should_return_String_with_the_same_value_of_input() {
        String expected = "1";
        String response = pruebaTDD.convert(1);
        assertEquals(expected, response);
    }

    @Test
    void should_return_fizz_when_input_is_multiple_of_Three() {
        String expected = "Fizz";
        String response = pruebaTDD.convert(3);
        assertEquals(expected, response);
    }

    @Test
    void should_return_buzz_when_input_is_multiple_of_five() {
        String expected = "Buzz";
        String response = pruebaTDD.convert(5);
        assertEquals(expected, response);
    }

    @Test
    void should_return_FizzBuzz_when_input_is_multiple_of_three_and_five() {
        String expected = "FizzBuzz";
        String response = pruebaTDD.convert(60);
        assertEquals(expected, response);
    }
}









