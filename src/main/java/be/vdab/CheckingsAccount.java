package be.vdab;

public class CheckingsAccount extends Account {

    SavingsAccount savingsAccount;
    Person owner;

    public CheckingsAccount(Person owner) {
        super();
        this.owner = owner;
        // savings aan vast hangen
        savingsAccount = new SavingsAccount();
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public SavingsAccount getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public void withdraw(double amount, CheckingsAccount beneficiary) throws InsufficientFundsException {
        super.withdraw(amount);
        beneficiary.deposit(amount);
    }

    public void depositToSavings(double amount) throws InsufficientFundsException {
        withdraw(amount);
        savingsAccount.deposit(amount);
    }

}
