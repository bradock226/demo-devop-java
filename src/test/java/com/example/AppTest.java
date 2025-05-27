package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void shouldAddCorrectly() {
        assertEquals(2, App.add(1, 1));
    }
}
