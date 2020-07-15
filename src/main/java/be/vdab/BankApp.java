package be.vdab;

import java.time.LocalDate;

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
            e.printStackTrace();
        }

        LocalDate now = LocalDate.now();

        if (now.equals(
                LocalDate.of(
                        LocalDate.now().getYear(),
                        1,
                        1
                )
        )) {
            ca.getSavingsAccount().addInterest();
        }

    }


}
