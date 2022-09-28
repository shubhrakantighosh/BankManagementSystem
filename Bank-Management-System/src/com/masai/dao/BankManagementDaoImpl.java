package com.masai.dao;

import com.masai.Utility.DBUtil;
import com.masai.bean.BankAccount;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BankManagementDaoImpl implements BankManagementDao{

    @Override
    public String createBankAccount(BankAccount bankAccount) {
        String message="Failed to create Bank Account";

        try (Connection connection=new DBUtil().provideConnection()) {

            PreparedStatement preparedStatement =connection.prepareStatement("insert into Bankmanagementsystem values(?,?,?,?,?,?,?,?,?,?);");

            preparedStatement.setInt(1,bankAccount.getCustomerID());
            preparedStatement.setString(2,bankAccount.getCustomerName());
            preparedStatement.setInt(3,bankAccount.getCustomerAccountBalance());
            preparedStatement.setString(4,bankAccount.getCustomerAddress());
            preparedStatement.setString(5,bankAccount.getCustomerMobileNumber());
            preparedStatement.setString(6,bankAccount.getCustomerEmailID());
            preparedStatement.setString(7,bankAccount.getCustomerDebitCardNo());
            preparedStatement.setInt(8,bankAccount.getCustomerATMPin());
            preparedStatement.setString(9,bankAccount.getBranchifscCode());
            preparedStatement.setString(10,bankAccount.getBranchName());

            if (preparedStatement.executeUpdate()>0)
                message="Account create successfully";

        }catch (SQLException sqlException){

        }

        return message;
    }
}
