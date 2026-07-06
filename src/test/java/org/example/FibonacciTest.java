package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibonacci() {
        int n = 10;
        int expected = 55;
        int actual = Fibonacci.fibonacci(n);

        System.out.println("Testing fibonacci(" + n + ")");
        System.out.println("Expected result: " + expected);
        System.out.println("Actual result: " + actual);

        assertEquals(expected, actual);

        System.out.println("fibonacci() test passed!");
    }

    /* @Test
    void main() {
        System.out.println("Testing main() method...");

        assertDoesNotThrow(() -> {
            Fibonacci.main(new String[]{});
        });

        System.out.println("main() executed successfully!");
    } */
}