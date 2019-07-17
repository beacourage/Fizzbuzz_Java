package com.company;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class FizzbuzzTest {

    private Fizzbuzz fizzbuzz;


    @Before
    public void setup() {
        fizzbuzz = new Fizzbuzz();

    }

    @DisplayName("Returns fizz with multiples of three")
    @Test
    public void fizz_3() {
        String result = fizzbuzz.play(3);
        assertEquals("fizz", result);
    }

    @Test
    public void fizz_12() {
        String result = fizzbuzz.play(12);
        assertEquals("fizz", result);
    }

    @DisplayName("Returns buzz with multiples of five")
    @Test
    public void buzz_5() {
        String result = fizzbuzz.play(5);
        assertEquals("buzz", result);
    }

    @Test
    public void buzz_10() {
        String result = fizzbuzz.play(10);
        assertEquals("buzz", result);
    }

    @DisplayName("Returns fizzbuzz with multiples of three and five")
    @Test
    public void fizzbuzz_15() {
        String result = fizzbuzz.play(15);
        assertEquals("fizzbuzz", result);
    }

    @Test
    public void fizzbuzz_30() {
        String result = fizzbuzz.play(30);
        assertEquals("fizzbuzz", result);
    }

    @Test
    public void fizzbuzz_45() {
        String result = fizzbuzz.play(45);
        assertEquals("fizzbuzz", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void number_over_200()  {
        fizzbuzz.play(250);
        fail("Should have thrown an illegal exception");
    }








}