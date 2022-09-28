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

            PreparedStatement preparedStatement =connection.prepareStatement("insert into BankManageSystem values(?,?,?,?,?,?,?,?)");

            preparedStatement.setInt(1,bankAccount.getCustomerID());
            preparedStatement.setString(2,bankAccount.getName());
            preparedStatement.setInt(3,bankAccount.getAccountBalance());
            preparedStatement.setString(4,bankAccount.getIfscCode());
            preparedStatement.setString(5,bankAccount.getBranchName());
            preparedStatement.setString(6,bankAccount.getAddress());
            preparedStatement.setString(7,bankAccount.getMobileNumber());
            preparedStatement.setString(8,bankAccount.getEmailID());

            if (preparedStatement.executeUpdate()>0)
                message="Account create successfully";

        }catch (SQLException sqlException){

        }

        return message;
    }
}
