package primeNumbers;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {
    private PrimeNumbers primeNumbers = new PrimeNumbers();
    @Test
    void prime() {

        //given

        int num1 = 7;
        int num2 = 30;
        int num3 = 100;
        int num4 = 2;
        int num5 = 3;
        int num6 = -5;

        //then
        Assert.assertEquals(3, primeNumbers.prime(num1));
        Assert.assertEquals(10, primeNumbers.prime(num2));
        Assert.assertEquals(25, primeNumbers.prime(num3));
        Assert.assertEquals(0, primeNumbers.prime(num4));
        Assert.assertEquals(1, primeNumbers.prime(num5));
        Assert.assertEquals(0, primeNumbers.prime(num6));

    }

    @Test
    void primeProduct() {

        //given
        long num1 = 1;
        long num2 = 4;
        long num3 = 21;
        long num4 = 30;
        long num5 = 2279;

        //then
        Assert.assertFalse(primeNumbers.primeProduct(num1));
        Assert.assertTrue(primeNumbers.primeProduct(num2));
        Assert.assertTrue(primeNumbers.primeProduct(num3));
        Assert.assertFalse(primeNumbers.primeProduct(num4));
        Assert.assertTrue(primeNumbers.primeProduct(num5));
    }
}