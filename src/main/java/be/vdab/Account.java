package be.vdab;

import org.apache.commons.lang3.RandomStringUtils;

public abstract class Account {

    String accountNumber;
    double balance;

    public Account() {
        this.accountNumber = this.generateUniqueAccountNumber();
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

    public void setBalance(double balance) {
        this.balance = balance;
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
