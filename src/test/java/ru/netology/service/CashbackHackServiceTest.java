package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test

    public void shouldCalc() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);


        Assert.assertEquals(expected, actual);
    }

    @Test

    public void shouldCalcWhen0() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void shouldCalcWhen1() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1;

        int expected = 999;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void shouldCalcWhen999() {
        CashbackHackService service = new CashbackHackService();

        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void shouldCalcWhen1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void shouldCalcWhen1001() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1001;

        int expected = 999;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void shouldCalcWhen1999() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1999;

        int expected = 1;
        int actual = service.remain(amount);


        Assert.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotCalcWhenNegative() {
        CashbackHackService service = new CashbackHackService();

        int amount = -1;

        int expected = 0;
        int actual = service.remain(amount);


        Assert.assertEquals(expected, actual);
    }

}
