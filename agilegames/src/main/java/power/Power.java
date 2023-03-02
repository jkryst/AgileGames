package power;

import multi.Multi;

public class Power {
    public static int power(int x, int y){
        if(y<0 || x==0) return 0;
        else if (y==0||x==1)
            return 1;

        int result = 1;
        for (int i = 0; i < y; i++) {
            result = Multi.multiply(result,x);
        }
        return result;
    }
}
