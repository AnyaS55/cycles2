package ru.netology.services;

public class Holydayserice {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int count = 0;

        for (int mounth = 0; mounth < 12; mounth++) {
            if (money >= threshold) {
                count++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }

        }
        return count;
    }
}
