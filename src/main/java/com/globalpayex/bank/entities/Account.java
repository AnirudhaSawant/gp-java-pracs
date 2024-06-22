package com.globalpayex.bank.entities;

import com.globalpayex.bank.exception.LowBalException;

import java.util.Optional;

public class Account {
    private long accNumber;
    private AccType accType;
    private double balance;

    public static final String ACCTYPE_SAVING = "Saving";
    public static final String ACCTYPE_CURRENT = "Current";


    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public AccType getAccType() {
        return accType;
    }

    public void setAccType(AccType accType) {
//        if(accType.equals(Account.ACCTYPE_SAVING) || accType.equals(Account.ACCTYPE_CURRENT)) {
//            this.accType = accType;
//        }
        this.accType = accType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account() {}

    public Account(long accNumber, AccType accType, double balance) {
        this.accNumber = accNumber;
        this.accType = accType;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNumber = " + accNumber +
                ", accType = '" + accType + '\'' +
                ", balance = " + balance +
                '}';
    }

    public double withdraw(double amount) throws LowBalException {
        System.out.println("Transaction starts!");
        try{
            if(amount <= 0) {
                throw new IllegalArgumentException("Amount passed needs to be positive and non zeros");
            }

            if(this.balance - amount < 1000) {
                throw new LowBalException("Account getting into low balance");
            }
            return this.balance -= amount;
        } finally {
            System.out.println("Transaction ends!");
        }

    }

    public double deposit(double amount) {
        return this.balance = this.balance + amount;
    }

    public Optional<String> getDetails() {
        if(this.accNumber == 0) {
            return Optional.empty();
        }
        return Optional.of(String.format("AccNo: %s\nAccType: %s\nBalance: %s",accNumber,accType,balance));
    }
}
