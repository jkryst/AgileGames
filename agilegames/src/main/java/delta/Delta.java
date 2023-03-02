package delta;

import add.Add;
import multi.Multi;

public class Delta {
    public static int delta(int a, int b, int c){
        if(a==0) return -1;
        int del = Add.add(Multi.multiply(b,b),-Multi.multiply(4,Multi.multiply(a,c)));
        if(del < 0)
        return 0;
        else if (del==0)
            return 1;
        else return 2;
    }
}
