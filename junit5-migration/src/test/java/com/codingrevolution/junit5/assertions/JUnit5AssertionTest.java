package com.codingrevolution.junit5.assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JUnit5AssertionTest {

    @Test
    void shouldFailWithMessage() {
        Assertions.assertEquals(1, 2, () -> "numbers " + 1 + " and " + 2 + " are not equal");
    }
}
