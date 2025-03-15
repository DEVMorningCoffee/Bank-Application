package com.personal_project.bank_application.User;

public class User {
    public String firstName;
    public String lastName;
    public long ID;
    public double savingBalance;
    public double checkingBalance;
    public long BankID;

    public User() {};


    // Include all the User class attribute
    public User(String firstName, String lastName, long ID, double savingBalance, double checkingBalance, long BankID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.savingBalance = savingBalance;
        this.checkingBalance = checkingBalance;
        this.BankID = BankID;
    }


    // Remove ID to create randomize User with unique ID
    public User(String firstName, String lastName, double savingBalance, double checkingBalance, long BankID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.savingBalance = savingBalance;
        this.checkingBalance = checkingBalance;
        this.BankID = BankID;

    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
        return this.savingBalance;
    }

    public double setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
        return this.checkingBalance;
    }
}
