package com.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void main() {
        int a = 1;
        int b = 2;
        int expected = 3;

        int actual = Main.add(a,b);
        Assertions.assertEquals(expected,actual);
    }
}