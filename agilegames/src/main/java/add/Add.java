package add;

public class Add {

    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println(add(x, y));
    }

    public static int add(int x, int y) {
        while (y != 0) {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        return x;
    }
}

