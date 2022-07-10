package io.github.dbc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdderTest {
    private Adder adder;

    @BeforeEach
    void setUp() {
        adder = new Adder();
    }

    @Test
    void addArrayElements() {
        int[] array = IntStream.range(0, 10).toArray();
        int expected = IntStream.range(0, 10).sum();
        int actual = adder.addArrayElements(array);
        assertEquals(expected, actual);
    }

    @Test
    void addArrayElements_emptyArray() {
        int[] array = {};
        int expected = 0;
        int actual = adder.addArrayElements(array);
        assertEquals(expected, actual);
    }

    @Test
    void addArrayElements_oneElement() {
        int[] array = {1};
        int expected = 1;
        int actual = adder.addArrayElements(array);
        assertEquals(expected, actual);
    }

    @Test
    void addArrayElements_oneElement_negative() {
        int[] array = {-1};
        int expected = -1;
        int actual = adder.addArrayElements(array);
        assertEquals(expected, actual);
    }

}