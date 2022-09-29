package ru.Netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {


    @Test
    void amountSquares() {
        ru.Netology.sqr.SQRService service = new ru.Netology.sqr.SQRService();
        int expected = 1;
        int actual = service.countSquares(9800, 9801);
        assertEquals(expected, actual);
    }

    @Test
    void amountSquaresOverLimit() {
        ru.Netology.sqr.SQRService service = new ru.Netology.sqr.SQRService();
        int expected = 0;
        int actual = service.countSquares(9802, 9803);
        assertEquals(expected, actual);
    }

    @Test
    void amountSquaresUnderLimit() {
        ru.Netology.sqr.SQRService service = new ru.Netology.sqr.SQRService();
        int expected = 0;
        int actual = service.countSquares(90, 99);
        assertEquals(expected, actual);
    }


}