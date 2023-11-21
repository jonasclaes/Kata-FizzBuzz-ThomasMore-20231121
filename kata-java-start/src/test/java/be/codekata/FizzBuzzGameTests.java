package be.codekata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzGameTests {
    @Test
    void shouldBeCallable() {
        FizzBuzzGame.play(0);
    }

    @Test
    void shouldReturnOneWhenGivenOne() {
        assertFizzBuzz(1, "1");
    }

    @Test
    void shouldReturnTwoWhenGivenTwo() {
        assertFizzBuzz(2, "2");
    }

    @Test
    void shouldReturnFizzWhenGivenThree() {
        assertFizzBuzz(3, "Fizz");

    }

    @Test
    void shouldReturnFourWhenGivenFour() {
        assertFizzBuzz(4, "4");
    }

    @Test
    void shouldReturnBuzzWhenGivenFive() {
        assertFizzBuzz(5, "Buzz");
    }

    @Test
    void shouldReturnFizzWhenGivenSix() {
        assertFizzBuzz(6, "Fizz");
    }

    @Test
    void shouldReturnFizzWhenGiveNine() {
        assertFizzBuzz(9, "Fizz");
    }

    @Test
    void shouldReturnBuzzWhenGivenTen() {
        assertFizzBuzz(10, "Buzz");
    }

    @Test
    void shouldReturnBuzzWhenGivenTwenty() {
        assertFizzBuzz(20, "Buzz");
    }

    @Test
    void shouldReturnFizzBuzzWhenGivenFifteen() {
        assertFizzBuzz(15, "FizzBuzz");
    }

    @Test
    void shouldReturnFizzBuzzWhenGivenThirty() {
        assertFizzBuzz(30, "FizzBuzz");
    }

    @Test
    void shouldReturnFizzBuzzWhenGivenFortyFive() {
        assertFizzBuzz(45, "FizzBuzz");
    }

    private static void assertFizzBuzz(int inputNumber, String expectedNumber) {
        String result = FizzBuzzGame.play(inputNumber);
        assertEquals(expectedNumber, result);
    }
}
