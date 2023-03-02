package alphaLetters;

public class AlphaLetters {

    public static char[] alphaLetters(char[][] tab) {
        if (tab.length <= 0) {
            return new char[0];
        }
        char[] result = new char[tab.length];
        for (int i = 0; i < tab.length; i++) {
            result[i] = tab[i][i % tab[i].length];
        }
        return result;
    }
}
