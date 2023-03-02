package palindrom;

public class Palindrome {

    public static void main(String[] args) {
        char[] tab1 = {'k','a','j','a','k'};
        char[] tab2 = {'r','y','b','a','k'};
        System.out.println("Does Kajak is palindrom? " + palindrome(tab1));
        System.out.println("Does Rybak is palindrom? " + palindrome(tab2));
    }


    public static boolean palindrome(char[] word){
        for (int i = 0; i < word.length/2; i++) {
            if (word[i] != word[word.length-1-i])
                return false;
        }

        return true;
    }
}
