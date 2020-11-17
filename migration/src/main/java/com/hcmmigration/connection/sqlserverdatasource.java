package com.hcmmigration.connection;
 
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

/**
 * sqlserverdatasource
 */
public class sqlserverdatasource {
    SQLServerDataSource ds = new SQLServerDataSource();
   
    public sqlserverdatasource(){

            // Establish the connection.
            server ser  = new server();
            ds.setServerName(ser.serverName);
            ds.setPortNumber(Integer.parseInt(ser.portNumber));
            ds.setDatabaseName(ser.databaseName);
            ds.setUser(ser.username);
            ds.setPassword(ser.password);
    }

    public SQLServerDataSource dataSource() {
        return ds;
    } 
}