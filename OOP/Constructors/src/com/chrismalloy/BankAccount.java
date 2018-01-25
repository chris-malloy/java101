package com.chrismalloy;

public class BankAccount {
    // initialize state components
    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    // constructor
    public BankAccount(){
        this(12345, 0.00, "Default Name", "Default Email",
                "Default Phone Number");
        System.out.println("Empty constructor called");
    }

    // can create multiple constructors for different types of initialization
    public BankAccount(String customerName, String customerEmail, String customerPhone) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public BankAccount(int accountNumber, double balance, String customerName, String customerEmail,
                       String customerPhone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }



    // setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }
    public void setCustomerPhone(String customerPhone){
        this.customerPhone = customerPhone;
    }

    // getters
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public String getCustomerPhone() {
        return customerPhone;
    }

    // methods
    public void depositFunds(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Amount of " + depositAmount + " has been processed. Balance is " + balance + ".");
    }
    public void withdrawFunds(double withdrawAmount){
        if (balance - withdrawAmount < 0) {
            System.out.println("Insufficient funds. " + balance + " available .");
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdraw amount of " + withdrawAmount + " processed. " + balance + " remaining.");
        }
    }
}