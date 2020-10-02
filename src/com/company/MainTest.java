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
            assertTrue(a >= min && a <= max);
        }
    }

    @Test
    void castDiceFail() {
        int min = 1;
        int max = 6;
        int range = max - min + 1;

        for (int i = 0; i < 1000; i++) {
            int a = (int)(Math.random() * range) + min;
            assertFalse(a <= 6 && a >= max);
        }
    }

}