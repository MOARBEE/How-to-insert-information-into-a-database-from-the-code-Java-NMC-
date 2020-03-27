package javadatabase1;
import java.sql.*;
import javax.swing.*;

public class JavaDatabase1 {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/test2","root","");
            System.out.println("Connection Successfuly");
            Statement stmt = conn.createStatement();
            String sqlInsert = "insert into register (fname, sname, phone, address) values ('Blessing', 'Ogbuokiri', '+27631484536', 'No 47 marjorie Street')";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            stmt.executeUpdate(sqlInsert);
            System.out.println("record succefully saved");
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("Connection Failed" +e);
        }
    }

}