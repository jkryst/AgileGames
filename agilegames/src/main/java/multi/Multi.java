package multi;

import add.Add;

public class Multi {

    public static void main(String[] args) {
        System.out.println(Multi.multiply(3,7));
    }

    public static int multiply(int x, int y) {
        boolean sign = false;


        if (x<0){
            x = -x;
            sign = true;
        }
        if  (y<0){
            y = -y;

            if (sign){
                sign = false;
            }else {
                sign = true;
            }
        }
        int sum = 0;
        for (int i = 0; i < x; i++) {
            sum = Add.add(sum,y);
        }
        if (sign){
            return -sum;
        }

        return sum;
    }
}
