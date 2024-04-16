/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jspider.bankmanagementsystem;

import java.awt.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author 91938
 */
public class Withdrawl extends JFrame implements ActionListener{
  JTextField amount;
JButton withdraw,back;
String pinnumber;
    public Withdrawl(String pinnumber) {
        this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text=new JLabel("enter the amount you want to withdraw");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(170, 300, 400, 20);
        image.add(text);
        
         amount=new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        amount.setBounds(170, 350, 320, 25);
        image.add(amount);
        
         withdraw=new JButton("withdraw");
        withdraw.setBounds(355, 485, 150, 30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
          back=new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900, 900);
        setLocation(300, 0);
        
        setVisible(true);
    }
    
     @Override
    public void actionPerformed(ActionEvent ae) {
      if(ae.getSource()== withdraw)
      {
          String number=amount.getText();
          Date date=new Date();
          if(number.equals(""))
          {
              JOptionPane.showMessageDialog(null, "Please enter the amount  you want to withdraw");
          }else
          {
              

              try {
                  Conn conn=new Conn();
              String query="insert into bank values('"+pinnumber+"','"+date+"','withdrawl','"+number+"')";
                  conn.st.executeUpdate(query);
                  JOptionPane.showMessageDialog(null, "Rs"+number+"withdraw Successfully");
                  setVisible(false);
                  new Trancsactions(pinnumber).setVisible(true);
              } catch (SQLException ex) {
                 System.out.println(ex);
              }
              
          }
      } else if(ae.getSource()== back)
      {
          setVisible(false);
         new Trancsactions(pinnumber).setVisible(true);
      }
    }
    public static void main(String args[])
    {
        new Withdrawl("");
    }  
}
