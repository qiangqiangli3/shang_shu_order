package com.housekeeper;

import java.util.Vector;

/**
 * @author liqiang
 * 连接池
 */
public class DataBase {

    public String jdbcDriver = "";
    public String dbUrl = "";
    public String dbUsername = "";
    public String dbPassword = "";
    public int initialConnections = 10;
    public int incrementalConnections = 5;
    public int maxConnections = 50;
    public Vector connections = null;

    public DataBase(){}

    public DataBase(String jdbcDriver,String dbUrl,String dbUsername,String dbPassword,int initialConnections,int
            incrementalConnections,int maxConnections,Vector connections){
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.dbUsername = dbUsername;
        this.dbPassword = dbPassword;
        this.incrementalConnections = incrementalConnections;
        this.initialConnections = initialConnections;
        this.maxConnections = maxConnections;
        this.connections = connections;
    }

}
