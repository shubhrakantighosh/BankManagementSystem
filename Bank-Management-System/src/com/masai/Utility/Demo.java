package com.masai.Utility;

import java.sql.Connection;

public class Demo {
    public static void main(String[] args) {
        Connection connection=new DBUtil().provideConnection();
        System.out.println(connection);
    }
}
