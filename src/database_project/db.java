/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_project;

/**
 *
 * @author Rushil
 */
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class db
{
	Connection connect = null;
	public static Connection java_db()
	{
		try
		{
			Class.forName("org.sqlite.JDBC");
			Connection connect= DriverManager.getConnection("jdbc:sqlite:C:\\Users\\admin\\Documents\\NetBeansProjects\\Database_project\\mydatabase.sqlite");
			return connect;	
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e);
			return null;
		}
		
	}
	

}