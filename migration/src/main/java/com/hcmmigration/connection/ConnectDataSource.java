package com.hcmmigration.connection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

//import com.hcmmigration.connection.sqlserverdatasource;


/**
 * Sample application that demonstrates how to connect to a SQL Server database by 
 * using a data source object.
 */

public class ConnectDataSource
{

    
    public static void main(String[] args) {

        public  ConnectDataSource()
        {
            // String serverName = null;
            // String portNumber = null;
            // String databaseName = null;
            // String username = null;
            // String password = null;

            try (InputStreamReader in = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(in)) 
            {

                // System.out.print("Enter server name: ");
                // serverName = br.readLine();
                // System.out.print("Enter port number: ");
                // portNumber = br.readLine();
                // System.out.print("Enter database name: ");
                // databaseName = br.readLine();
                // System.out.print("Enter username: ");
                // username = br.readLine();
                // System.out.print("Enter password: ");
                // password = br.readLine();


                // sqlserverdatasource ds = new sqlserverdatasource();
                // Establish the connection.
                // SQLServerDataSource ds = new SQLServerDataSource();
                // ds.setServerName(ser.serverName);
                // ds.setPortNumber(Integer.parseInt(ser.portNumber));
                // ds.setDatabaseName(ser.databaseName);
                // ds.setUser(ser.username);
                // ds.setPassword(ser.password);
                //(Connection con = ds.getConnection(); Statement stmt = con.createStatement();) 
                try (Connection con = new sqlserverdatasource().dataSource().getConnection(); Statement stmt = con.createStatement(); ) 
                {
                    System.out.println();
                    System.out.println("Connection established successfully.");

                    // Create and execute an SQL statement that returns user name.
                    String SQL = "SELECT SUSER_SNAME()";
                    try (ResultSet rs = stmt.executeQuery(SQL)) {
                        // Iterate through the data in the result set and display it.
                        while (rs.next()) {
                            System.out.println("user name: " + rs.getString(1));
                        }
                    }

                }
                
            }
            // Handle any errors that may have occurred.
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}