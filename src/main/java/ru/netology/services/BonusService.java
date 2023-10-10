package ru.netology.services;

public class BonusService {
    public long calculate(long income, long expenses, long threshold) {
        int count = 0; // счётчик месяцев отдыха
        long money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}

