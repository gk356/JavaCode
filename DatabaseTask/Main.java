package com.company;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
	// write your code here
        DatabaseConnection dbc = new DatabaseConnection();
        System.out.println();
        System.out.println(" !!!!!! University Database !!!!!! ");
        String repeat;
        do {
            System.out.println("Choices: ");
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println();
            System.out.print("Enter your choice: \r");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    recordInserting(dbc);
                    break;
                case 2:
                    recordUpdating(dbc);
                    break;
                case 3:
                    recordDeleting(dbc);
                    break;
                case 4:
                    recordDisplaying(dbc);
                    break;
                default:
                    System.out.println(choice + " is not a valid choice. Please enter the valid choice.");

            }
            System.out.print("Would like to query again? Please enter (y/n)  \r" );
            repeat = sc.next();
        }while(repeat.equals("Y") || repeat.equals("y"));
    }


    public static void recordInserting(DatabaseConnection db) throws InputMismatchException, SQLException, NullPointerException {

        System.out.println("Insert Selected");
        System.out.println("In which table you want to insert record?");
        System.out.print("Please enter 'student' or 'faculty': \r");
        String tableName = sc.next();

        switch (tableName){
            case "student":
                System.out.println("Student Selected");
                System.out.println();
                System.out.println("What values do you want to enter? Choose options below. ");
                System.out.println("1. All Values i.e id, name, major");
                System.out.println("2. Only id and name");
                int option = sc.nextInt();
                boolean flag = true;

                while(flag){
                    flag = false;
                    switch (option){
                        case 1:

                            PreparedStatement ps = db.getCon().prepareStatement("insert into student value(?, ?, ?)");
                            System.out.print("Enter Id: \r");
                            int id = sc.nextInt();
                            System.out.print("Enter Name: \r");
                            String name = sc.next();
                            System.out.print("Enter Major: \r");
                            String major = sc.next();
                            ps.setInt(1, id);
                            ps.setString(2,name);
                            ps.setString(3, major);
                            int x = ps.executeUpdate();
                            if(x>0){
                                System.out.println("Record Inserted");
                            }
                            flag = false;
                            break;

                        case 2:

                            PreparedStatement pst = db.getCon().prepareStatement("insert into student (stid, name) value(?, ?)");
                            System.out.print("Enter Id: \r");
                            int idd = sc.nextInt();
                            System.out.print("Enter Name: \r");
                            String namee = sc.next();
                            pst.setInt(1, idd);
                            pst.setString(2,namee);
                            //ps.setString(4, major);
                            int y = pst.executeUpdate();

                            if(y>0){
                                System.out.println("Record Inserted");
                            }
                            flag = false;
                            break;

                        default:
                            System.out.println("Invalid Option. Please enter the valid option. ");
                            System.out.println("Please choose the option again.");
                            option = sc.nextInt();
                            flag = true;
                            break;
                    }
                }
                break;

            case "faculty":
                System.out.println("Faculty Selected");

                System.out.println();
                System.out.println("What values do you want to enter? Choose options below. ");
                System.out.println("1. All Values i.e faculty id, name, department");
                System.out.println("2. Only id and name");
                int options = sc.nextInt();
                boolean flags = true;

                while(flags){

                    switch (options){
                        case 1:

                            PreparedStatement ps = db.getCon().prepareStatement("insert into faculty (fid, name, depart)value(?, ?, ?)");
                            System.out.print("Enter faculty ID: \r");
                            int id = sc.nextInt();
                            System.out.print("Enter Name: \r");
                            String name = sc.next();
                            System.out.print("Enter Department: \r");
                            String major = sc.next();
                            ps.setInt(1, id);
                            ps.setString(2,name);
                            ps.setString(3, major);
                            int x = ps.executeUpdate();
                            if(x>0){
                                System.out.println("Record Inserted");
                            }
                            flags = false;
                            break;

                        case 2:

                            PreparedStatement pst = db.getCon().prepareStatement("insert into faculty (fid, name) value(?, ?)");
                            System.out.print("Enter faculty Id: \r");
                            int idd = sc.nextInt();
                            System.out.print("Enter Name: \r");
                            String namee = sc.next();
                            pst.setInt(1, idd);
                            pst.setString(2,namee);
                            //ps.setString(4, major);
                            int y = pst.executeUpdate();

                            if(y>0){
                                System.out.println("Record Inserted");
                            }
                            flags = false;
                            break;

                        default:
                            System.out.println("Invalid Option. Please enter the valid option. ");
                            System.out.println("Please choose the option again.");
                            options = sc.nextInt();
                            flags = true;
                            break;
                    }
                }
                break;
            default:
                System.out.println("Incorrect table name. It is case sensitive. Table name student and faculty");
        }
    }

    public static void recordUpdating(DatabaseConnection db) throws SQLException {
        System.out.println("Update Selected");
        System.out.println("Which table you want to update record?");
        System.out.print("Please enter 'student' or 'faculty': \r");
        String tableName = sc.next();

        switch (tableName){
            case "student":
                System.out.println("Student Selected");
                System.out.println();
                System.out.println("What values do you want to update? Choose options below. ");
                System.out.println("1. All Values i.e name, major");
                System.out.println("2. Only name");
                System.out.println("3. Only major");
                int option = sc.nextInt();
                boolean flag = true;

                while(flag){
                    flag = false;
                    switch (option){
                        case 1:

                            PreparedStatement ps = db.getCon().prepareStatement("update student set name = ?, major = ? where stid = ?");
                            System.out.print("Enter Id: \r");
                            int id = sc.nextInt();
                            System.out.print("Enter Name: \r");
                            String name = sc.next();
                            System.out.print("Enter Major: \r");
                            String major = sc.next();
                            ps.setInt(3, id);
                            ps.setString(1,name);
                            ps.setString(2, major);
                            int x = ps.executeUpdate();
                            if(x>0){
                                System.out.println("Record Updated");
                            }
                            flag = false;
                            break;

                        case 2:

                            PreparedStatement pst = db.getCon().prepareStatement("update student set name = ? where stid = ?");
                            System.out.print("Enter Id: \r");
                            int idd = sc.nextInt();
                            System.out.print("Enter Name: \r");
                            String namee = sc.next();
                            pst.setInt(2, idd);
                            pst.setString(1,namee);
                            //ps.setString(4, major);
                            int y = pst.executeUpdate();

                            if(y>0){
                                System.out.println("Record Updated");
                            }
                            flag = false;
                            break;
                        case 3:
                            PreparedStatement psmt = db.getCon().prepareStatement("update student set major = ? where stid = ?");
                            System.out.print("Enter Id: \r");
                            int iidd = sc.nextInt();
                            System.out.print("Enter major: \r");
                            String mjr = sc.next();
                            psmt.setInt(2, iidd);
                            psmt.setString(1,mjr);
                            //ps.setString(4, major);
                            int z = psmt.executeUpdate();

                            if(z>0){
                                System.out.println("Record Updated");
                            }
                            flag = false;
                            break;

                        default:
                            System.out.println("Invalid Option. Please enter the valid option. ");
                            System.out.println("Please choose the option again.");
                            option = sc.nextInt();
                            flag = true;
                            break;
                    }
                }
                break;

            case "faculty":
                System.out.println("Faculty Selected");

                System.out.println();
                System.out.println("What values do you want to update? Choose options below. ");
                System.out.println("1. All Values i.e both name, department");
                System.out.println("2. Only name");
                System.out.println("3. Only department");
                int options = sc.nextInt();
                boolean flags = true;

                while(flags){

                    switch (options){
                        case 1:

                            PreparedStatement ps = db.getCon().prepareStatement("update faculty set name = ?, depart = ? where fid = ?");
                            System.out.print("Enter faculty ID: \r");
                            int id = sc.nextInt();
                            System.out.print("Enter Name: \r");
                            String name = sc.next();
                            System.out.print("Enter Department: \r");
                            String depart = sc.next();
                            ps.setInt(3, id);
                            ps.setString(1,name);
                            ps.setString(2, depart);
                            int x = ps.executeUpdate();
                            if(x>0){
                                System.out.println("Record Updated");
                            }
                            flags = false;
                            break;

                        case 2:

                            PreparedStatement pst = db.getCon().prepareStatement("update faculty set name = ? where fid = ?");
                            System.out.print("Enter faculty Id: \r");
                            int idd = sc.nextInt();
                            System.out.print("Enter Name: \r");
                            String namee = sc.next();
                            pst.setInt(2, idd);
                            pst.setString(1,namee);
                            //ps.setString(4, major);
                            int y = pst.executeUpdate();

                            if(y>0){
                                System.out.println("Record Updated");
                            }
                            flags = false;
                            break;
                        case 3:

                            PreparedStatement psmt = db.getCon().prepareStatement("update faculty set depart = ? where fid = ?");
                            System.out.print("Enter faculty Id: \r");
                            int iidd = sc.nextInt();
                            System.out.print("Enter Department: \r");
                            String depat = sc.next();
                            psmt.setInt(2, iidd);
                            psmt.setString(1,depat);
                            //ps.setString(4, major);
                            int z = psmt.executeUpdate();

                            if(z>0){
                                System.out.println("Record Inserted");
                            }
                            flags = false;
                            break;

                        default:
                            System.out.println("Invalid Option. Please enter the valid option. ");
                            System.out.println("Please choose the option again.");
                            options = sc.nextInt();
                            flags = true;
                            break;
                    }
                }
                break;
            default:
                System.out.println("Incorrect table name. It is case sensitive. Table name student and faculty");
        }

    }

    public static void recordDeleting(DatabaseConnection db) throws SQLException {
        System.out.println("Delete Selected");
        System.out.println("In which table you want to delete record?");
        System.out.print("Please enter 'student' or 'faculty': \r");
        String tableName = sc.next();

        switch (tableName){
            case "student":
                System.out.println("Student Selected");
                System.out.println();
                System.out.println("What values do you want to enter? Choose options below. ");
                System.out.println("1. Delete entire table");
                System.out.println("2. Delete the record by id");
                int option = sc.nextInt();
                boolean flag = true;

                while(flag){
                    flag = false;
                    switch (option){
                        case 1:

                            PreparedStatement ps = db.getCon().prepareStatement("delete from student");

                            int x = ps.executeUpdate();
                            if(x>0){
                                System.out.println("All Record Deleted");
                            }
                            flag = false;
                            break;

                        case 2:

                            PreparedStatement pst = db.getCon().prepareStatement("delete from student where stid = ?");
                            System.out.print("Enter Id: \r");
                            int idd = sc.nextInt();

                            pst.setInt(1, idd);

                            int y = pst.executeUpdate();

                            if(y>0){
                                System.out.println("Record Deleted");
                            }
                            flag = false;
                            break;

                        default:
                            System.out.println("Invalid Option. Please enter the valid option. ");
                            System.out.println("Please choose the option again.");
                            option = sc.nextInt();
                            flag = true;
                            break;
                    }
                }
                break;

            case "faculty":
                System.out.println("Faculty Selected");

                System.out.println();
                System.out.println("What values do you want to delete? Choose options below. ");
                System.out.println("1. Delete entire table");
                System.out.println("2. Delete the record by id");
                int options = sc.nextInt();
                boolean flags = true;

                while(flags){

                    switch (options){
                        case 1:

                            PreparedStatement ps = db.getCon().prepareStatement("delete from faculty");

                            int x = ps.executeUpdate();
                            if(x>0){
                                System.out.println("Entire table deleted");
                            }
                            flags = false;
                            break;

                        case 2:

                            PreparedStatement pst = db.getCon().prepareStatement("delete from faculty where fid = ?");
                            System.out.print("Enter faculty Id: \r");
                            int idd = sc.nextInt();
                            pst.setInt(1, idd);
                            int y = pst.executeUpdate();

                            if(y>0){
                                System.out.println("Record Deleted3");
                            }
                            flags = false;
                            break;

                        default:
                            System.out.println("Invalid Option. Please enter the valid option. ");
                            System.out.println("Please choose the option again.");
                            options = sc.nextInt();
                            flags = true;
                            break;
                    }
                }
                break;
            default:
                System.out.println("Incorrect table name. It is case sensitive. Table name student and faculty");
        }

    }
    public static void recordDisplaying(DatabaseConnection db) throws SQLException {
        System.out.println("Display Selected");
        System.out.println("Which table you want to delete record?");
        System.out.print("Please enter 'student' or 'faculty': \r");
        String tableName = sc.next();

        switch (tableName){
            case "student":
                System.out.println("Student Selected");
                System.out.println();
                System.out.println("What do you want to display? Choose options below. ");
                System.out.println("1. Display entire table");
                System.out.println("2. Display with particular id");
                int option = sc.nextInt();
                boolean flag = true;

                while(flag){
                    flag = false;
                    switch (option){
                        case 1:

                            PreparedStatement ps = db.getCon().prepareStatement("select *  from student");
                            ResultSet rs = ps.executeQuery();
                            while(rs.next()){
                                System.out.println(rs.getInt(1)+ " " + rs.getString(2)+ " " + rs.getString(3));
                            }

                            flag = false;
                            break;

                        case 2:

                            PreparedStatement pst = db.getCon().prepareStatement("select * from student where stid = ?");
                            System.out.print("Enter Id: \r");
                            int idd = sc.nextInt();
                            pst.setInt(1, idd);

                            ResultSet rst = pst.executeQuery();
                            while(rst.next()){
                                System.out.println(rst.getInt(1)+ " " + rst.getString(2)+ " " + rst.getString(3));
                            }

                            flag = false;
                            break;

                        default:
                            System.out.println("Invalid Option. Please enter the valid option. ");
                            System.out.println("Please choose the option again.");
                            option = sc.nextInt();
                            flag = true;
                            break;
                    }
                }
                break;

            case "faculty":
                System.out.println("Faculty Selected");

                System.out.println();
                System.out.println("What values do you want to display? Choose options below. ");
                System.out.println("1. Display entire table");
                System.out.println("2. Display the record by id");
                int options = sc.nextInt();
                boolean flags = true;

                while(flags){

                    switch (options){
                        case 1:


                            PreparedStatement ps = db.getCon().prepareStatement("select *  from faculty");
                            ResultSet rs = ps.executeQuery();
                            while(rs.next()){
                                System.out.println(rs.getInt(1)+ " " + rs.getString(2)+ " " + rs.getString(3));
                            }

                            flags = false;
                            break;

                        case 2:
                            PreparedStatement pst = db.getCon().prepareStatement("select * from faculty where fid = ?");
                            System.out.print("Enter Id: \r");
                            int idd = sc.nextInt();
                            pst.setInt(1, idd);

                            ResultSet rst = pst.executeQuery();
                            while(rst.next()){
                                System.out.println(rst.getInt(1)+ " " + rst.getString(2)+ " " + rst.getString(3));
                            }

                            flags = false;
                            break;

                        default:
                            System.out.println("Invalid Option. Please enter the valid option. ");
                            System.out.println("Please choose the option again.");
                            options = sc.nextInt();
                            flags = true;
                            break;
                    }
                }
                break;
            default:
                System.out.println("Incorrect table name. It is case sensitive. Table name student and faculty");
        }


    }
}
