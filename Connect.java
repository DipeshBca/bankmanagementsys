package Management_Bank;

import java.sql.*;

public class Connect {
    public Statement stmt;
    Connection con;
    public Connect(){
        try{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Tarusha@2021");
        stmt = con.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
