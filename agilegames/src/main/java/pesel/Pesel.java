package pesel;

public class Pesel {
    String pesel;

    public boolean pesel(int[] numbers) {
        if (numbers.length!=11) return false;

        if (numbers[3] == 0) return false;

        if (numbers[4]>3) return false;

        int controlSum = (numbers[0]*1)%10+
                (numbers[1]*3)%10+
                (numbers[2]*7)%10+
                (numbers[3]*9)%10+
                (numbers[4]*1)%10+
                (numbers[5]*3)%10+
                (numbers[6]*7)%10+
                (numbers[7]*9)%10+
                (numbers[9]*1)%10+
                (numbers[10]*3)%10;
        int controlDigit = 10-controlSum%10;

        if (numbers[11]!=controlDigit) return false;

        return true;
    }
}
