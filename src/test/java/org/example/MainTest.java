package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @org.junit.jupiter.api.Test
    public void testQou() {
        Main tes = new Main();
        assertEquals("0 + 2 must be 2 ", 2, tes.main(0, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExp(){
        Main tes = new Main();
        tes.main(98, 8);

    }
}