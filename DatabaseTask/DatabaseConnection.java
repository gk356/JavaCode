package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private Connection con;
    private String url;
    private String un;
    private String pw;

    public DatabaseConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        this.url = "jdbc:mysql://localhost:3306/university";
        this.un = "root";
        this.pw = "Gautam1234@";

        con = DriverManager.getConnection(url, un, pw);

        if(con != null){
            System.out.println("Connection Successful");
        }

    }

    public Connection getCon(){
        return con;
    }
}
