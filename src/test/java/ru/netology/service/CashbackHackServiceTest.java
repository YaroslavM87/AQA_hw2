package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldThrowExceptionIfAmountIsZeroOrLess() throws IllegalArgumentException {
        assertThrows(IllegalArgumentException.class, () -> new CashbackHackService().remain(-1));
    }

    @Test
    void shouldReturnZeroIfAmountIsDivisibleBy1000(){
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    void shouldReturnDifferenceBetweenBoundaryAndAmount(){
        CashbackHackService service = new CashbackHackService();
        int amount = 450;
        int actual = service.remain(amount);
        int expected = 550;
        assertEquals(actual, expected);
    }
}