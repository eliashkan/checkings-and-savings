package be.vdab;

public class CheckingsAccount extends Account {

    SavingsAccount savingsAccount;
    Person owner;

    public CheckingsAccount(Person owner) {
        super();
        this.owner = owner;
        // savings aan vast hangen
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

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        super.withdraw(amount);
    }

}
