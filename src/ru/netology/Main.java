package ru.netology;

public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum = 1_000_000;

        int periodFirst = 1; //период в годах
        int paymentFirst = service.calculate(sum, periodFirst);
        System.out.println(paymentFirst);

        int periodSecond = 2;
        int paymentSecond = service.calculate(sum, periodSecond);
        System.out.println(paymentSecond);

        int periodThird = 3;
        int paymentThird = service.calculate(sum, periodThird);
        System.out.println(paymentThird);

        int firstPeriod = 1;
        int firstPayment = service.calculate2(sum, firstPeriod);
        System.out.println(firstPayment);

        int secondPeriod = 2;
        int secondPayment = service.calculate2(sum, secondPeriod);
        System.out.println(secondPayment);

        int thirdPeriod = 3;
        int thirdPayment = service.calculate2(sum, thirdPeriod);
        System.out.println(thirdPayment);
    }
}
