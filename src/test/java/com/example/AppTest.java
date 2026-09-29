package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void greetsName() {
        assertEquals("Hello, Manu!", App.greeting("Manu"));
    }
    @Test void handlesBlankName() {
        assertEquals("Hello, World!", App.greeting(" "));
    }
}
