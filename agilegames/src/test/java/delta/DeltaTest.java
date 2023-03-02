package delta;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeltaTest {

    @Test
    void delta() {
        assertEquals(2, Delta.delta(1,3,0));
        assertEquals(1, Delta.delta(1,0,0));
        assertEquals(0, Delta.delta(1,0,1));
        assertEquals(2, Delta.delta(1,2,-3));
        assertEquals(-1, Delta.delta(0,3,2));
    }
}