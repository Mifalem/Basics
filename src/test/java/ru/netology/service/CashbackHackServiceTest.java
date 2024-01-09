package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test

    public void shouldCalc() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test

    public void shouldCalcWhen0() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    @Test

    public void shouldCalcWhen1() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }

    @Test

    public void shouldCalcWhen999() {
        CashbackHackService service = new CashbackHackService();

        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test

    public void shouldCalcWhen1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test

    public void shouldCalcWhen1001() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }

    @Test

    public void shouldCalcWhen1999() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1999;

        int actual = service.remain(amount);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test

    public void shouldNotCalcWhenNegative() {
        CashbackHackService service = new CashbackHackService();

        int amount = -1;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

}

