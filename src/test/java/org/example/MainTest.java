package org.example;

import static org.junit.Assert.*;
import org.junit.Test;


public class MainTest {

    @Test
    public void _min() {
        assertEquals(1,Main._min(Main.read("numbers1.txt")));
        assertEquals(1,Main._min(Main.read("numbers2.txt")));
        assertEquals(1,Main._min(Main.read("numbers3.txt")));
    }

    @Test
    public void _max() {
        assertEquals(4,Main._max(Main.read("numbers1.txt")));
        assertEquals(9,Main._max(Main.read("numbers2.txt")));
        assertEquals(9,Main._max(Main.read("numbers3.txt")));
    }

    @Test
    public void _sum() {
        assertEquals(10,Main._sum(Main.read("numbers1.txt")));
        assertEquals(121,Main._sum(Main.read("numbers2.txt")));
        assertEquals(134,Main._sum(Main.read("numbers3.txt")));
    }

    @Test
    public void _mult() {
        assertEquals(24,Main._mult(Main.read("numbers1.txt")));
        assertEquals(1568669696,Main._mult(Main.read("numbers2.txt")));
        assertEquals(1459617792,Main._mult(Main.read("numbers3.txt")));
    }
}