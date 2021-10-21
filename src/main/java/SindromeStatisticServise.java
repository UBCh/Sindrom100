public class SindromeStatisticServise {



        public long CalculateSum(long[] sales) {
            int sum = 0;
            for (long sale : sales) {
                sum += sale;
            }
            return sum;
        }
        public long findAverage(long[] sales)
        {
            return CalculateSum(sales)/ sales.length;
        }

        public long findMax(long[] sales) {
            int max = 0;
            int month = 0;
            for (long sale : sales) {
                if (sale >= sales[max]) {
                    max = month;
                }
                month = month + 1;
            }
            return max + 1;
        }
        public long findMin(long[] sales) {
           int min = 0;
           int month = 0;
            for ( long sale : sales) {
                if (sale <= sales[min]) {
                    min = month;
                } month = month + 1;
            }
            return min + 1;
        }
        public long numberBelowAverage(long[] sales) {
            long average =  CalculateSum(sales)/ sales.length;
           int month = 0;
            for (long sale : sales) {
                if (sale > average) {
                    month = month + 1;
                }
            }
            return month;
        }

        public long numbersAboveAverage(long[] sales) {
            long average =  CalculateSum(sales)/ sales.length;
            int month = 0;
            for (long sale : sales) {
                if (sale < average) {
                    month = month + 1;
                }
            }
            return month;
        }
    }


