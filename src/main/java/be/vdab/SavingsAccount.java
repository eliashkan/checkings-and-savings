package be.vdab;

import java.time.LocalDate;

public class SavingsAccount extends Account {

    private CheckingsAccount checkingsAccount;
    private double interestRate;

    public SavingsAccount(double interestRate) {
        super();
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public SavingsAccount setInterestRate(double interestRate) {
        this.interestRate = interestRate;
        return this;
    }

    public CheckingsAccount getCheckingsAccount() {
        return checkingsAccount;
    }

    public SavingsAccount setCheckingsAccount(CheckingsAccount checkingsAccount) {
        this.checkingsAccount = checkingsAccount;
        return this;
    }

    public void depositToCheckings(double amount) throws InsufficientFundsException {
        this.withdraw(amount);
        checkingsAccount.deposit(amount);
    }

    public void addInterest() throws NotJanuaryFirstException {
        LocalDate now = LocalDate.now();

        if (now.equals(
                LocalDate.of(
                        LocalDate.now().getYear(),
                        1,
                        1
                )
        )) {
            balance += balance * interestRate;
        } else {
            throw new NotJanuaryFirstException();
        }
    }
}

// 3% -> 0.03
// 0.3 -> 0.003