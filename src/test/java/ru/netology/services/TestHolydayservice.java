package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.services.Holydayserice;

public class TestHolydayservice {
    @Test
    public void calculate1() {

        Holydayserice service = new Holydayserice();

        int income = 10_000;
        int expence = 3000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expence, threshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void calculate2() {

        Holydayserice service = new Holydayserice();

        int income = 100_000;
        int expence = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = service.calculate(income, expence, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
