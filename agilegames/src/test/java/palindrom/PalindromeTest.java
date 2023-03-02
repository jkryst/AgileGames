package palindrom;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @org.junit.jupiter.api.Test
    void palindrome() {
        char[] palindrome = {'k', 'a', 'j', 'a', 'k'};
        assertTrue(Palindrome.palindrome(palindrome));
    }
}