package ru.netology.service;



import static org.testng.Assert.assertEquals;
public class CashbackHackServiceTest {
    @org.testng.annotation.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.testng.annotation.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);


    }
}

