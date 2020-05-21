package com.company;

import com.DbConnection.*;
import com.DbConnection.DatabaseConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws NullPointerException, ClassNotFoundException, SQLException {
	// write your code here
        DatabaseConnection db =  new DatabaseConnection();

        Statement st = db.con.createStatement();

        ResultSet rs = st.executeQuery("select * from student");
        System.out.println("Records that are available in student table: ");
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getString(3));
        }

        // Writing new records to new tables professor in same database

        System.out.println("Inserting record in Table faculty");
        int x = st.executeUpdate("insert into faculty value(1111, 'Albebrt', 'CSE')");

        if(x> 0){
            System.out.println("Record inserted in faculty table");
        }








    }
}


