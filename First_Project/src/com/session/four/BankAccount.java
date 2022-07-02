package com.session.four;

public class BankAccount {
    private int accountNumber;
    private String customerName;
    private double balance;

    public boolean createAccount(int accountNumber,String customerName,double balance) throws Exception{
        boolean created = true;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
        if (balance < 500){
            created = false;
            throw new InputMisMatchException("Amount can't be less than 500");
        }
        return created;
    }
    public double deposit(double amount){
        return balance + amount;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
}

public String getCustomerName() {
    return customerName;
}

public void setCustomerName(String customerName) {
    this.customerName = customerName;
}

public double getBalance() {
    return balance;
}

public void setBalance(double balance) {
    this.balance = balance;
}
public double doWithDraw(double amount) throws Exception{
    
    if (amount<0) {
    	throw new InputMisMatchException ("You cannot withdraw negative amount");
    }
    double afterWithdraw = this.balance - amount;
    if(afterWithdraw <500)
        throw new InsufficientBalanceException("Balance is less than 500 i.e Insufficient balance");
    return afterWithdraw;
}
public double doDeposit(double amount) throws Exception{
    if (amount >200000.0)
        throw new OverDepositException("You are not allowed to deposit more than 200,000 CAD");
    double afterDeposit = this.balance + amount;
    this.balance = afterDeposit;
    return afterDeposit;
}

public java.lang.String displayDetails() {
    return " "+
            "accountNumber=" + accountNumber +
            ", customerName='" + customerName + '\'' +
            ", balance=" + balance;
}
}



