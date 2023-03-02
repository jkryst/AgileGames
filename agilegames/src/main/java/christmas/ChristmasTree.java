package christmas;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ChristmasTree {
    public static void tree(int n) {
        int center = 2 * n;
        StringBuilder line;
        for (int i = 0; i < n; i++) {
            line = new StringBuilder();
            for (int j = 0; j < center; j++)
                line.append(" ");
            int j = 0;
            for (; j < i ; j++) {
                line.append("/");
            }
            line.append("A");
            j++;
            for (; j < 2 * i + 1; j++)
                line.append("\\");
            center--;
            System.out.println(line);
        }

    }

    public static void main(String[] args) {
        try {
            System.out.println("Podaj liczbę:");
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            int N = parseInt(s);
            tree(N);
        } catch (NumberFormatException ex) {
            System.out.println("To nie jest liczba! \nPodaj liczbę:");
        }
    }
}
