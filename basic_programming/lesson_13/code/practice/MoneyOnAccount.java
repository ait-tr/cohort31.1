package practice;

public class MoneyOnAccount {
    public static void main(String[] args) {
//        Реализуйте метод, который получает на вход сумму вклада, процентную ставку и количество дней,
//        а возвращает накопленный доход.
//        Формула для расчета: https://www.raiffeisen.ru/wiki/kak-rasschitat-procenty-po-vkladu/

        double sum = 0;
        double percent = 0;
        int days = 0;

        double g = gain(350_000, 4.7, 273);
        System.out.println("Gain = " + g);

        System.out.println(gain(350000, 4.7, 273));

    }

    //============Methods==============

        public static double gain(double sum, double percent, int days) {
//            double s = sum;
//            double p = percent;
//            int d = days;
//            int dy = 365;
//
//            double result = (s * p * d / dy) / 100.0;
//
//            return result;
            return (sum * percent * days/365) / 100.0;
        }

    //=================================
}
