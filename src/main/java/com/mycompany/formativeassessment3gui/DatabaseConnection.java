/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formativeassessment3gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author bbdnet2332
 */
public class DatabaseConnection {
    
    Connection conMySQLConnectionString = null;
    Statement statementSQLQuery = null;
    ResultSet rsPassengers = null;
    String strSQLQuery;
    
    boolean DidConnect = true;
    
    public DatabaseConnection(){
        
        try {
            this.conMySQLConnectionString = DriverManager.getConnection("jdbc:mysql://localhost:3306/fa3_assessment", "root", "!QAZxsw2");
            this.statementSQLQuery = this.conMySQLConnectionString.createStatement();
        } catch (SQLException ex) {
            DidConnect = false;
            return ;
        }
        
        DidConnect = true;
    }
    
    public void viewPassengerInfo(){
        try {
            this.strSQLQuery = "SELECT * FROM fa3_assessment.passenger_details;";
            this.rsPassengers = statementSQLQuery.executeQuery(this.strSQLQuery);
            
            ResultSetMetaData rsmt = this.rsPassengers.getMetaData();
        
            int resultsCount = rsmt.getColumnCount();
            Vector vColumn = new Vector(resultsCount);
            
            for(int count = 1; count < resultsCount; count++) {
                vColumn.add(rsmt.getColumnTypeName(count));
            }
            
            Vector vData = new Vector();
            Vector vRow = new Vector();
            
            while(this.rsPassengers.next()){
                vRow = new Vector(resultsCount);
                for(int count = 1; count <) {
                    
                }
            }
            
        } catch (SQLException ex) {
            DidConnect = false;
            return ;
        }
        
        
        
        DidConnect = true;
    }
    
}
