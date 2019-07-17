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





}