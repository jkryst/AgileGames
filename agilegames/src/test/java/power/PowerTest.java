package power;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerTest {

    @Test
    void power() {
        assertEquals(4, Power.power(2,2));
        assertEquals(0, Power.power(0,3));
        assertEquals(0, Power.power(5,-13));
        assertEquals(1,Power.power(1,100));
        assertEquals(64, Power.power(2,6));
    }
}