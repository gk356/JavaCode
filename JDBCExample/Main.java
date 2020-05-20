package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
	// write your code here
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/university";
        String un = "root";
        String pw = "Gautam1234@";

        Connection con = DriverManager.getConnection(url, un, pw);

        if(con != null){
            System.out.println("Connection Successful!!!");
        }

        Statement st = con.createStatement();
        int x = st.executeUpdate("insert into student values(116, 'Hola', 'MSC')");

        if(x > 0){
            System.out.println("Inserted Record");
        }
        System.out.println ("Enter the Student ID: ");
        int stid = sc.nextInt();
        System.out.println("Enter the Student Name: ");
        String name = sc.next();
        System.out.println("enter the student major: ");
        String major = sc.next();


        int y = st.executeUpdate("insert into student value("+stid+",'"+name+"', '"+major+"')");
        if(y > 0){
            System.out.println("New Record Inserted");
        }

        int a = st.executeUpdate("update student set name = 'Ramsay' where stid = 112");

        if(a > 0){
            System.out.println("Updated Record");
        }

        int b = st.executeUpdate("delete from student where stid = 112");

        if(b > 0){
            System.out.println("Deleted Record");
        }




    }
}
