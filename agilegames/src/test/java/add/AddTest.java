package add;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    @Test
    void addTest() {
        //given
        int x = 3;
        int y = 5;

        //then
        assertEquals(8,  Add.add(x, y));
        assertNotEquals(8, Add.add(3,8));
        assertEquals(-7, Add.add(5, -12));
    }
}