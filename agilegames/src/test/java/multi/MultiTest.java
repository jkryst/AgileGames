package multi;

import org.junit.jupiter.api.Test;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.*;

class MultiTest {

    @Test
    void multiply() {

        //then
        assertEquals(21,Multi.multiply(7,3));
        assertEquals(0, Multi.multiply(17,0));
        assertEquals(0, Multi.multiply(0,9));
        assertEquals(-28, Multi.multiply(-7,4));
        assertEquals(28, Multi.multiply(-7,-4));
        assertEquals(-56, Multi.multiply(7,-8));
    }
}