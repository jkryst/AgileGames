package palindrom;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @org.junit.jupiter.api.Test
    void IsPalindromeTest() {
        //given
        char[] tab1 = {'k', 'a', 'j', 'a', 'k'};

        char[] tab2 = {'w', 'o', 'j', 'a', 'k'};

        char[]emptyTab = new char[0];

        char[]tab3 = {'p'};

        //then
        assertTrue(Palindrome.palindrome(tab1));

        assertFalse(Palindrome.palindrome(emptyTab));

        assertFalse(Palindrome.palindrome(tab2));

        assertTrue(Palindrome.palindrome(tab3));
    }
}