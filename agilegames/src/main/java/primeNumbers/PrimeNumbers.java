package primeNumbers;

public class PrimeNumbers {

    public int prime(int x) {
        int numOfPrimes = 0;

        if(x<3) {
            return numOfPrimes;
        }

        for(int i = 2; i<x; i++) {
            if(checkIfIsPrime(i)) numOfPrimes++;
        }

        return numOfPrimes;

    }

    public boolean checkIfIsPrime(int x){
        if(x<2) {
            return false;
        } else if (x==2) {
            return true;
        }

        for(int i = 2; i<x; i++) {
            if (x%i==0) return false;
        }

        return true;
    }

    public boolean checkIfIsPrimeLong(long x){
        if(x<2) {
            return false;
        } else if (x==2) {
            return true;
        }

        for(long i = 2; i<x; i++) {
            if (x%i==0) return false;
        }

        return true;
    }


    public boolean primeProduct(Long num) {
        if (num < 4) return false;

        for (long i = 2; i < num; i++) {
            if(num%i==0 && checkIfIsPrimeLong(i) && checkIfIsPrimeLong(num/i)) return true;
        }
        return false;
    }
}