package com.DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public Connection con = null;
    private String url = "jdbc:mysql://localhost:3306/university";
    private String un = "root";
    private String pw = "Gautam1234@";

    public DatabaseConnection() throws NullPointerException, ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        con = DriverManager.getConnection(this.url, this.un, this.pw);

        if(con != null){
            System.out.println("Connection Successful!!!");
        }
    }

}
