package com.masai.usecases;

import com.masai.bean.BankAccount;
import com.masai.dao.BankManagementDaoImpl;
import com.masai.exceptions.BankAccountException;

import java.util.Scanner;

public class GetCustomerInformationByCustomerAccountNumber {
    public static void main(String[] args) {

        try {

            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter Your Customer Account Number : ");
            int userCustomerAccountNumber=scanner.nextInt();

            BankAccount bankAccount=new BankManagementDaoImpl().getAccountInformationByCustomerAccountNumber(userCustomerAccountNumber);

            System.out.println(bankAccount);

        }catch (BankAccountException bankAccountException) {
            throw new RuntimeException(bankAccountException.getMessage());
        }

    }
}
