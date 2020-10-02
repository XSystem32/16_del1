package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void castDiceSuccess() {
        int min = 1;
        int max = 6;
        int range = max - min + 1;

        for (int i = 0; i < 1000; i++) {
            int a = (int)(Math.random() * range) + min;
            int b = (int)(Math.random() * range) + min;
            int c = a + b;

            System.out.println(c);

            assertTrue(c >= min*2 && c <= max*2);
        }
    }

}