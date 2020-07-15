package be.vdab;

import org.apache.commons.lang3.RandomStringUtils;

public abstract class Account {

    static double generalInterestRate = 0.03;
    String accountNumber;
    double balance;

    public Account() {
        this.accountNumber = this.generateUniqueAccountNumber();
    }

    public static double getGeneralInterestRate() {
        return generalInterestRate;
    }

    public static void setGeneralInterestRate(double generalInterestRate) {
        Account.generalInterestRate = generalInterestRate;

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    double checkBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new InsufficientFundsException();
        }
    }

    private String generateUniqueAccountNumber() {
        return RandomStringUtils.randomAlphanumeric(16, 17);
    }

}
