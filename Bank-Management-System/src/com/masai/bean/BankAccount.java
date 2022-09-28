package com.masai.bean;

public class BankAccount {

    private int customerID;
    private String name;
    private int accountBalance;
    private String ifscCode;
    private String branchName;
    private String address;
    private String mobileNumber;
    private String emailID;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public BankAccount(int customerID, String name, int accountBalance, String ifscCode, String branchName, String address, String mobileNumber, String emailID) {
        this.customerID = customerID;
        this.name = name;
        this.accountBalance = accountBalance;
        this.ifscCode = ifscCode;
        this.branchName = branchName;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.emailID = emailID;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "customerID=" + customerID +
                ", name='" + name + '\'' +
                ", accountBalance=" + accountBalance +
                ", ifscCode='" + ifscCode + '\'' +
                ", branchName='" + branchName + '\'' +
                ", address='" + address + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", emailID='" + emailID + '\'' +
                '}';
    }

    public BankAccount() {
    }
}
