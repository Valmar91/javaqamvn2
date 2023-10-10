package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class BonusServiceTest {
    @ParameterizedTest
//    @CsvSource({
//            "3, 10000,3000,20000",
//            "2, 100000,60000,150000"
//    })
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    public void testDayLimit(int expected, long income, long expenses, long threshold) {
        BonusService service = new BonusService();

        long actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
