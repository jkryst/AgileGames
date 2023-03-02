package alphaLetters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphaLettersTest {

    @Test
    void alphaLetters() {
        char[][] testTab = new char[5][];
        String word = "kot";
        testTab[0] = word.toCharArray();
        word = "uw";
        testTab[1] = word.toCharArray();
        word = "pies";
        testTab[2] = word.toCharArray();
        word = "las";
        testTab[3] = word.toCharArray();
        word = "ul";
        testTab[4] = word.toCharArray();
        char[] result = {'k','w','e','l','u'};
        assertArrayEquals(result, AlphaLetters.alphaLetters(testTab));
        assertEquals(0,AlphaLetters.alphaLetters(new char[0][]).length);
        assertNotEquals('l',AlphaLetters.alphaLetters(testTab)[4]);

    }
}