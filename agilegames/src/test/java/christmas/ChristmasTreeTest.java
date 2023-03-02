package christmas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasTreeTest {

    @Test
    void tree() {
        String[] test = {"      A",
"     /A\\",
"    //A\\\\"};
        assertArrayEquals(test,ChristmasTree.tree(3));
        assertNotEquals(test,ChristmasTree.tree(4));
        assertEquals(0, ChristmasTree.tree(-2).length);
    }
}