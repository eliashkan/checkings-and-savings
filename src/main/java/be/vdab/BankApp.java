package be.vdab;

public class BankApp {


    public static void main(String[] args) {

        Person elias = new Person();
        elias.setName("Elias Khan");
        CheckingsAccount ca = new CheckingsAccount(elias);

        // static variable demonstration
        double interest = ca.generalInterestRate;
        interest = Account.generalInterestRate;

        System.out.println("account number" + ca.getAccountNumber());
        System.out.println("Owner: " + ca.getOwner().getName());

        try {
            ca.depositToSavings(500F);
        } catch (InsufficientFundsException e) {
            System.out.println("not enough money");
        }

        try {
            ca.getSavingsAccount().addInterest();
        } catch (NotJanuaryFirstException e) {
            System.out.println("No interest for you my friend.");
        }

    }


}
