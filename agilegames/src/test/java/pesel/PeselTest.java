package pesel;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class PeselTest {

    @org.junit.jupiter.api.Test
    void checkIfPeselIsValid() {
        Pesel pesel = new Pesel();

        //valid pesel
        int[] pesel1 = {6,5,0,1,2,7,4,7,7,6,1};
        int[] pesel2 = {5,5,0,2,2,3,7,1,3,7,9};

        //invalid pesel
        int[] pesel3 = {1,3,4,5,6,4,5,3,5,6,5};
        int[] pesel4 = {1,3,4,5,6,4,5,3,5,6};

        Assert.assertTrue(pesel.pesel(pesel1));
        Assert.assertTrue(pesel.pesel(pesel2));
        Assert.assertFalse(pesel.pesel(pesel3));

    }
}