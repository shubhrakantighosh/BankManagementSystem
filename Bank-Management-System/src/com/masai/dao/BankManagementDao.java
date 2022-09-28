package com.masai.dao;

import com.masai.bean.BankAccount;
import com.masai.exceptions.BankAccountException;


public interface BankManagementDao {

    public String createBankAccount(BankAccount bankAccount) throws BankAccountException;
    public BankAccount getAccountInformationByCustomerID(int userCustomerID) throws BankAccountException;

}
