package ru.netology.stats;

public class StatsService {

    public int getSumSales(int[] total) {  //Сумма всех продаж
        int sum = 0;
        for (int sales : total) {
            sum = sum + sales;
        }
        return sum;
    }

    public int getAverageSum(int[] month) { //Средняя сумму продаж в месяц.
        int sum = getSumSales(month);
        return (int) sum / month.length;

    }

    public int getMaxSales(long[] sales) { //Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
        int  maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }

        return maxMonth + 1;

     }
    public int getMinSales (long[] sales) { //Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int getUnderAverageSale(int[] sales) { //Месяцы с продажами ниже среднего
        int underAverage = 0;
        int average = getAverageSum(sales);
        for (int sale : sales) {
            if (sale < average) {
                underAverage += 1;
            }
        }
        return underAverage;
    }
    public int getOverAverageSale(int[] sales) { // Месяцы с продажами выше среднего
        int overAverage = 0;
        int average = getAverageSum(sales);
        for (int sale : sales) {
            if (sale > average) {
                overAverage += 1;
            }
        }
        return overAverage;
    }

}











