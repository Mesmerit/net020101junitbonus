package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateZeroAdd() {
        CashbackHackService cashbackHack = new CashbackHackService();

        int actual = cashbackHack.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateAddIfSmallAmount() {
        CashbackHackService cashbackHack = new CashbackHackService();

        int actual = cashbackHack.remain(100);
        int expected = 900;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateAddIfLargeAmount() {
        CashbackHackService cashbackHack = new CashbackHackService();

        int actual = cashbackHack.remain(29900);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

}