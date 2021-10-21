import static org.junit.jupiter.api.Assertions.*;

class SindromeStatisticServiseTest {
    private final long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
     SindromeStatisticServise service = new SindromeStatisticServise();

    @org.junit.jupiter.api.Test
    void shouldCalculateSum() {
        long expected = 180;
        long actual = service.CalculateSum(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void findAverage() {

        long expected = 15;
        long actual = service.findAverage(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void findMax() {
       long expected = 8;
       long actual = service.findMax(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void findMin() {
        int expected = 9;
        Long actual = service.findMin(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void numberBelowAverage() {
       int expected = 5;
        Long actual = service.numberBelowAverage(sales);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void numbersAboveAverage() {
        int expected = 5;
        Long actual = service.numbersAboveAverage(sales);
        assertEquals(expected, actual);
    }

}