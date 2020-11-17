package com.hcmmigration.connection;
/**
 * server
 */
public class server {

    protected String serverName = "Travelmart/sqlexpress";
    protected String portNumber = "44375";
    protected String databaseName = "TravelTest";
    protected String username = "sa";
    protected String password = "admin123";

    public server() {}

    public String getServername() { 
        return serverName;
    }

    public String getPortnumber() { 
        return portNumber;
    }

    public String getDataBase() {
        return databaseName;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

}