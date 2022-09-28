package com.masai.dao;

import com.masai.Utility.DBUtil;
import com.masai.bean.BankAccount;
import com.masai.exceptions.BankAccountException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankManagementDaoImpl implements BankManagementDao{

    @Override
    public String createBankAccount(BankAccount bankAccount) throws BankAccountException {
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

    @Override
    public BankAccount getAccountInformationByCustomerID(int userCustomerID) throws BankAccountException {
        BankAccount bankAccount=null;

        try (Connection connection=new DBUtil().provideConnection()) {

            PreparedStatement preparedStatement=connection.prepareStatement("select * from BankManagementSystem where customerID=? ;");
            preparedStatement.setInt(1,userCustomerID);
            ResultSet resultSet=preparedStatement.executeQuery();

            if(resultSet.next()){

                int customerID=resultSet.getInt("customerID");
                String customerName=resultSet.getString("customerName");
                int customerAccountBalance=resultSet.getInt("customerAccountBalance");
                String customerAddress=resultSet.getString("customerAddress");
                String customerMobileNumber=resultSet.getString("customerMobileNumber");
                String customerEmailID=resultSet.getString("customerEmailID");
                String customerDebitCardNo=resultSet.getString("customerDebitCardNo");
                int customerATMPin=resultSet.getInt("customerATMPin");
                String branchifscCode=resultSet.getString("branchifscCode");
                String branchName=resultSet.getString("branchName");

                bankAccount=new BankAccount(customerID,customerName,customerAccountBalance,customerAddress,customerMobileNumber,customerEmailID,customerDebitCardNo,customerATMPin,branchifscCode,branchName);

            }else
                throw new BankAccountException("Doesn't Exit Customer Or Wrong Customer ID : "+userCustomerID);

        }catch (SQLException sqlException){
            throw new BankAccountException(sqlException.getMessage());
        }

        return bankAccount;
    }
}
