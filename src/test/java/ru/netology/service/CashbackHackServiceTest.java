package ru.netology.service;



import static org.junit.Assert.assertEquals;
public class CashbackHackServiceTest {
    @org.junit.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testRemainWithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);


    }

    @org.junit.Test

    public void testRemainCash() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @org.junit.Test

    public void testRemainCash1() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1200;
        int actual = service.remain(amount);
        int expected = 800;

        assertEquals(actual, expected);
    }
}

