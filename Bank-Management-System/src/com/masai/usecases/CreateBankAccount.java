package com.masai.usecases;

import com.masai.bean.BankAccount;
import com.masai.dao.BankManagementDaoImpl;

import java.util.Scanner;

public class CreateBankAccount {
    public static void main(String[] args) {

        try {

            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter Your Customer ID : ");
            int customerID=scanner.nextInt();
            System.out.println("Enter Your Name : ");
            String name=scanner.next();
            System.out.println("Enter Amount");
            int accountBlance=scanner.nextInt();
            System.out.println("Enter IFSC Code : ");
            String ifscCode=scanner.next();
            System.out.println("Enter Branch Name : ");
            String branchName=scanner.next();
            System.out.println("Enter Your Address : ");
            String address=scanner.next();
            System.out.println("Enter Your Mobile Number : ");
            String mobileNumber=scanner.next();
            System.out.println("Enter Your Email ID : ");
            String emailID=scanner.next();

            BankAccount bankAccount=new BankAccount(customerID,name,accountBlance,ifscCode,branchName,address,mobileNumber,emailID);

            String message=new BankManagementDaoImpl().createBankAccount(bankAccount);

            System.out.println(message);

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
