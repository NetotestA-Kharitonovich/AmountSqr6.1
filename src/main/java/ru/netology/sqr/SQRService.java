package ru.Netology.sqr;

public class SQRService {

    public int countSquares(int min, int max) {
        int amount = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min & i * i <= max) {
                amount++;
            }
        }

        return amount;
    }

}
