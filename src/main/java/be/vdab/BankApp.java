package be.vdab;

public class BankApp {


    public static void main(String[] args) {

        Person elias = new Person();
        elias.setName("Elias Khan");
        CheckingsAccount ca = new CheckingsAccount(elias);

        System.out.println("account number" + ca.getAccountNumber());
        System.out.println("Owner: " + ca.getOwner().getName());

    }


}
