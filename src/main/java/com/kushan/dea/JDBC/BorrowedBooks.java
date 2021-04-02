package com.kushan.dea.JDBC;
import java.sql.* ;  // for standard JDBC programs
import java.math.*;

public class BorrowedBooks {
    public static void dataGet(){
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/library","root","");  
            //here sonoo is database name, root is username and password  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("SELECT Lending_Tittle FROM Lending WHERE Lavailable=='0';");  
            while(rs.next())  
            System.out.println(rs.getString(0));  
            con.close();  
            }catch(Exception e){ System.out.println(e);}  
    }
}

