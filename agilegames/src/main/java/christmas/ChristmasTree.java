package christmas;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ChristmasTree {
    public static String[] tree(int n) {
        if(n<=0){
            return new String[0];
        }
        int center = 2 * n;
        String[] treeList = new String[n];
        StringBuilder line;
        for (int i = 0; i < n; i++) {
            line = new StringBuilder();
            for (int j = 0; j < center; j++)
                line.append(" ");
            int j = 0;
            for (; j < i; j++) {
                line.append("/");
            }
            line.append("A");
            j++;
            for (; j < 2 * i + 1; j++)
                line.append("\\");
            center--;
            treeList[i] = String.valueOf(line);
        }
        return treeList;
    }

    static void printList(String[] text){
        for (String s: text) {
            System.out.println((s));
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Podaj liczbę:");
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            int N = parseInt(s);
            printList(tree(N));
        } catch (NumberFormatException ex) {
            System.out.println("To nie jest liczba! \nPodaj liczbę:");
        }
    }
}
