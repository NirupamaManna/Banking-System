/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jspider.bankmanagementsystem;

/**
 *
 * @author 91938
 */
import java.sql.*;
public class Conn {
    Connection con;
    Statement st;
    public Conn()
    {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectbank","root","admin");
        st=con.createStatement();
        }catch(Exception e){
        System.out.println(st);
        }
        
       
        
        }
    }

