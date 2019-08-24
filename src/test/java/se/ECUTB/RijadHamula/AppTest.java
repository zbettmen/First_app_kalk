package se.ECUTB.RijadHamula;

import static org.junit.Assert.assertEquals;

import junit.framework.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    @Test
    public void testAdd() {
        double kalk1 = 2.3;
        double kalk2 = 4;

        Kalk kalk = new Kalk();

        // Actual
        double actual = kalk.add(kalk1, kalk2);

        // Assert
        double expected = kalk1 + kalk2;
        assertEquals(expected, actual,0);

    }
    @Test
    public void testSub() {
        double kalk1 = -2;
        double kalk2 = -2;

        Kalk kalk = new Kalk();
        double actual = kalk.sub(kalk1, kalk2);

        double expected = kalk1 - kalk2;
        assertEquals(expected, actual, 0);

    }
    @Test
    public void testMulti() {

        double kalk1 = 50;
        double kalk2 = -40;

        Kalk kalk = new Kalk();
        double actual = kalk.multi(kalk1,kalk2);
        double expected = kalk1 * kalk2;
        assertEquals(actual, expected, 0);

    }
    @Test
    public void testDiv() {

        double kalk1 = 50;
        double kalk2 = 2;

        Kalk kalk = new Kalk();
        double actual = kalk.div(kalk1,kalk2);
        double expected = kalk1 / kalk2;

        assertEquals(actual, expected, 0);
    }

}

