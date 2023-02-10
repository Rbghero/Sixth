package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Month;

public class StatsServiceTest {
    @Test
    public void shouldFindSum() { //Сумма всех продаж
        StatsService service = new StatsService();

        int[] month = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.getSumSales(month);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverage() { //Средняя сумму продаж в месяц.
        StatsService service = new StatsService();

        int[] month = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.getAverageSum(month);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMax() { //Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
        StatsService service = new StatsService();

        long[] month = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.getMaxSales(month);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldFindMin() { //Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
        StatsService service = new StatsService();

        long[] month = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.getMinSales(month);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUnderAverageSale() { //Месяцы с продажами ниже среднего
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getUnderAverageSale(sales);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldOverAverageSale() {  // Месяцы с продажами выше среднего
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.getOverAverageSale(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}






