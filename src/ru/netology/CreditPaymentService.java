package ru.netology;

public class CreditPaymentService {
    public int calculate(int amount, int period) {
        float percent = 9.99F;
        int amountOfPayment;
        float amountPay;
        float interestRate = percent / (100 * 12);
        float index = (float) ((float) interestRate * Math.pow((1 + interestRate), period * 12) / (Math.pow((1 + interestRate), period * 12) - 1));
        amountPay = amount * index;
        amountOfPayment = (int) amountPay;
        return amountOfPayment;
    }

    public int calculate2(int amount, int period) {
        float percent = 9.99F;
        float interestRate = percent / (100 * 12);
        float amountPay = (float) (amount * interestRate / (1 - Math.pow((1 + interestRate), -12 * period)));
        int amountOfPayment = (int) amountPay;
        return amountOfPayment;
    }
}
