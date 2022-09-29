package com.masai.usecases;

import com.masai.dao.BankManagementDaoImpl;
import com.masai.exceptions.BankAccountException;

import java.util.Scanner;

public class CurrentBalance {
    public static void main(String[] args) {

        try {

            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter Your Customer Account Number ");
            int userCustomerAccountNumber=scanner.nextInt();

            String message=new BankManagementDaoImpl().checkCurrentBalance(userCustomerAccountNumber);
            System.out.println(message);

        } catch (BankAccountException e) {
            throw new RuntimeException(e);
        }

    }
}
