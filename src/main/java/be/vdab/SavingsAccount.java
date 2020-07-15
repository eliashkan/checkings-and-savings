package be.vdab;

public class SavingsAccount extends Account {

    private CheckingsAccount checkingsAccount;

    public CheckingsAccount getCheckingsAccount() {
        return checkingsAccount;
    }

    public SavingsAccount setCheckingsAccount(CheckingsAccount checkingsAccount) {
        this.checkingsAccount = checkingsAccount;
        return this;
    }

    public SavingsAccount() {
        super();
    }

    public void depositToCheckings(){

    }
}
