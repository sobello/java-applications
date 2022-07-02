package com.session.four;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        try {
            bank.createAccount(121, "Parv", 600);
            bank.doWithDraw(-100);
            System.out.println(bank.displayDetails());
            bank.doDeposit(1000000);
            System.out.println(bank.displayDetails());
        }catch(Throwable th){
            System.out.println(""+th.getMessage());
        }

    }
}
