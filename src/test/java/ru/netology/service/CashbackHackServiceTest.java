package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateZeroAdd() {
        CashbackHackService cashbackHack = new CashbackHackService();

        int actual = cashbackHack.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateAddIfSmallAmount() {
        CashbackHackService cashbackHack = new CashbackHackService();

        int actual = cashbackHack.remain(100);
        int expected = 900;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateAddIfLargeAmount() {
        CashbackHackService cashbackHack = new CashbackHackService();

        int actual = cashbackHack.remain(29900);
        int expected = 100;

        assertEquals(actual, expected);
    }

}