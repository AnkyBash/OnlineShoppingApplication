/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author ankit
 */
public class DataConnect 
{
public static Connection getConnection() 
{
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/OnlineShopping");
			return con;
                    } 
                catch (Exception ex)
                    {
                            System.out.println("Database.getConnection() Error -->" + ex.getMessage());
                            return null;
                    }
	}

	public static void close(Connection con) 
        {
		try {
			con.close();
                    }
                catch (Exception ex) 
                    {
                    }    
        }
}
