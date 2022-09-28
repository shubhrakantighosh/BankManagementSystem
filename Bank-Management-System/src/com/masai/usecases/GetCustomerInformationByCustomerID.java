package com.masai.usecases;

import com.masai.bean.BankAccount;
import com.masai.dao.BankManagementDaoImpl;
import com.masai.exceptions.BankAccountException;

import java.util.Scanner;

public class GetCustomerInformationByCustomerID {
    public static void main(String[] args) {

        try {

            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter Your Customer ID : ");
            int userCustomerID=scanner.nextInt();

            BankAccount bankAccount=new BankManagementDaoImpl().getAccountInformationByCustomerID(userCustomerID);

            System.out.println(bankAccount);

        }catch (BankAccountException bankAccountException) {
            throw new RuntimeException(bankAccountException.getMessage());
        }

    }
}
