/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jspider.bankmanagementsystem;

import java.awt.*;
import java.util.*;
import javax.swing.*;

import java.awt.event.*;
import java.sql.*;


/**
 *
 * @author 91938
 */
public class Signuptwo extends JFrame implements ActionListener{

   
    JTextField adharTextField,panTextField,catagoryTextField;
    JButton next;
    JRadioButton mRadio,fRadio,married,unmarried,others;
    
    JComboBox income,education,catagory,religion,occupation;
    JRadioButton syes,nyes,eyes,eno;
    String formNumber;
    Signuptwo(String formNumber)
    {
        this.formNumber=formNumber;
        setLayout(null);
        setTitle("NEW APPLICATION PAGE FORM NO:2");
       
        
        
        
        JLabel additionalInfo=new JLabel("Page 2: Additional Details");
        additionalInfo.setFont(new Font("Ralevay",Font.BOLD,22));
        additionalInfo.setBounds(290, 80, 400, 30);
        add(additionalInfo);
        
        JLabel religionn=new JLabel("Religion:");
        religionn.setFont(new Font("Ralevay",Font.BOLD,20));
        religionn.setBounds(100, 140, 100, 30);
        add(religionn);
        
        String value[]={"Hindu","Musulim","Christian","Jain","Shikh","Other"};
         religion=new JComboBox(value);
         religion.setBounds(300,140,400,30);
         religion.setBackground(Color.white);
         add(religion);
        
          JLabel Catagoryy=new JLabel("Catagory");
        Catagoryy.setFont(new Font("Ralevay",Font.BOLD,20));
        Catagoryy.setBounds(100, 190, 200, 30);
        add(Catagoryy);
        
       String catagoryvalue[]={"general","obc","sc","st","others"};
         catagory=new JComboBox(catagoryvalue);  
        catagory.setBounds(300, 190, 400, 30);
        catagory.setBackground(Color.white);
           add(catagory);
       
      
        JLabel incomee=new JLabel("Income");
        incomee.setFont(new Font("Ralevay",Font.BOLD,20));
        incomee.setBounds(100, 240, 200, 30);
        add(incomee);
         
        
        String incomeValue[]={"null","<1,50,000","<2,50,000","<5,00,000","upto 10,00,00"};
         income=new JComboBox(incomeValue);  
         income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.white);
           add(income);
           
        
        
        
        
        JLabel edu=new JLabel("Educational");
        edu.setFont(new Font("Ralevay",Font.BOLD,20));
        edu.setBounds(100, 290, 200, 30);
        add(edu);
        
        JLabel qualification=new JLabel("Qualification:");
        qualification.setFont(new Font("Ralevay",Font.BOLD,20));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);
        
        String educationalvalue[]={"NOn-graduate","graduate","post graduate","doctorate"};
         education=new JComboBox(educationalvalue);  
         education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.white);
           add(education);
         
         
         
        
       
        
        
        
          JLabel occupationn=new JLabel("Occupation:");
        occupationn.setFont(new Font("Ralevay",Font.BOLD,20));
        occupationn.setBounds(100, 390, 200, 30);
        add(occupationn);
        
        String occupationvalue[]={"Salaried","self employed","Business man","student","retired","others"};
         occupation=new JComboBox(occupationvalue);  
         occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.white);
           add(occupation);
        
         
        
        
        JLabel pan=new JLabel("PAN number:");
        pan.setFont(new Font("Ralevay",Font.BOLD,20));
        pan.setBounds(100, 440, 200, 30);
        add(pan);
        
          panTextField=new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);
        
        JLabel adhar=new JLabel("Adhar Number:");
        adhar.setFont(new Font("Ralevay",Font.BOLD,20));
        adhar.setBounds(100, 490, 200, 30);
        add(adhar);
        
         adharTextField=new JTextField();
        adharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        adharTextField.setBounds(300,490,400,30);
        add(adharTextField);
        
         JLabel senior=new JLabel("Senior Citizen:");
        senior.setFont(new Font("Ralevay",Font.BOLD,20));
        senior.setBounds(100, 350, 200, 30);
        add(senior);
        
        syes=new JRadioButton("yes");
        syes.setBounds(300, 350, 100, 30);
        syes.setBackground(Color.white);
        add(syes);
        
        nyes=new JRadioButton("no");
        nyes.setBounds(450, 350, 100, 30);
        nyes.setBackground(Color.white);
        add(nyes);
        
         ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(nyes);
        buttonGroup.add(syes);
        
       JLabel existinAccaount=new JLabel("existing account");
           existinAccaount.setFont(new Font("Ralevay",Font.BOLD,20));
           existinAccaount.setBounds(100, 540, 200, 30);
           add(existinAccaount);
        
        eyes=new JRadioButton("yes");
        eyes.setBounds(300, 540, 100, 30);
        eyes.setBackground(Color.white);
        add(eyes);
        
        eno=new JRadioButton("no");
        eno.setBounds(450, 540, 100, 30);
        eno.setBackground(Color.white);
        add(eno);
        
       
        
        ButtonGroup buttonGroup2=new ButtonGroup();
        buttonGroup.add(eyes);
        buttonGroup.add(eno);
        
         
        
        
        
        
         next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener( this);
        add(next);
        
        getContentPane().setBackground(Color.white);
        setSize(850,800);
        setVisible(true);
        setLocation(350,10);
        
    }
 
    public void actionPerformed(ActionEvent e) {
        
       
        String srelgion=(String)religion.getSelectedItem();
        String scatagory=(String)catagory.getSelectedItem();
        String sincome=(String)income.getSelectedItem();
        String seducation=(String)education.getSelectedItem();
        String soccupatio=(String) occupation.getSelectedItem();
        String sseneior=null;
        if(syes.isSelected())
        {
            sseneior="Yes";
        }else if(nyes.isSelected())
        {
            sseneior="No";
        }
       String sexistaccount=null;
      
        if(eyes.isSelected())
        {
            sexistaccount="Yes";
        }
        else if(eno.isSelected())
        {
           sexistaccount="No"; 
        }
        
        String span=panTextField.getText();
        String sadhar=adharTextField.getText();
       
         try{
             Conn c=new Conn();
       String query="insert into signuptwo values(' "+formNumber+" ', ' "+srelgion+" ', ' "+scatagory+" ', ' "+sincome+" ', ' "+seducation+" ', ' "+soccupatio+" ', ' "+sseneior+" ', ' "+sexistaccount+" ',' "+span+" ',' "+sadhar+" ')";
                c.st.executeUpdate(query);
                setVisible(false);
                new SignUpthree(formNumber).setVisible(true);
        }catch(Exception ae){
        System.out.println();
        }
        
        
        

        
   }
  public static void  main(String args[])
    {
        new Signuptwo("");
    }
    
}
