package be.vdab;

public class CheckingsAccount extends Account {

    SavingsAccount savingsAccount;

    public CheckingsAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.savingsAccount = new SavingsAccount();
    }

    public SavingsAccount getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        super.withdraw(amount);
    }

}
