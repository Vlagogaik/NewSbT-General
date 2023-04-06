package ru.myself;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMult {
    @Test
    void testMultiplyOleg() throws OlegException {
        assertEquals(8, Multiplication.multiply(2, 4));
        assertEquals(20, Multiplication.multiply(10, 2));
    }

    @Test
    void testMultiply() {
        assertThrows(OlegException.class, () -> {
            Multiplication.multiply(3, 5);
        });
        assertThrows(OlegException.class, () -> {
            Multiplication.multiply(7, 9);
        });
    }
}
