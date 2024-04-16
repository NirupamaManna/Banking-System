/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jspider.bankmanagementsystem;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

/**
 *
 * @author 91938
 */
public class SignUpone extends JFrame implements ActionListener{
    long random;
    JTextField nameTextField,fathernameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pinTextField;
    JButton next;
    JRadioButton mRadio,fRadio,married,unmarried,others;
    JDateChooser dateChooser;
    SignUpone()
    {
        setLayout(null);
        Random ran=new Random();
         random=Math.abs((ran.nextLong() % 9000L)+1000L);
       
        
        JLabel formno=new JLabel("Application Form Number" + random);
        formno.setFont(new Font("Ralevay",Font.BOLD,38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        JLabel personalInfo=new JLabel("Page 1: Personal Details");
        personalInfo.setFont(new Font("Ralevay",Font.BOLD,22));
        personalInfo.setBounds(280, 80, 400, 30);
        add(personalInfo);
        
        JLabel name=new JLabel("Name:");
        name.setFont(new Font("Ralevay",Font.BOLD,20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
         nameTextField=new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
                
        JLabel fathername=new JLabel("Father's Name:");
        fathername.setFont(new Font("Ralevay",Font.BOLD,20));
        fathername.setBounds(100, 190, 200, 30);
        add(fathername);
        
         fathernameTextField=new JTextField();
        fathernameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fathernameTextField.setBounds(300,190,400,30);
        add(fathernameTextField);
        
         JLabel dob=new JLabel("Date Of Birth:");
        dob.setFont(new Font("Ralevay",Font.BOLD,20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
         dateChooser=new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
        
        
        JLabel gender=new JLabel("Gender:");
        gender.setFont(new Font("Ralevay",Font.BOLD,20));
        gender.setBounds(100, 290, 100, 30);
        add(gender);
        
         mRadio=new JRadioButton("Male");
        mRadio.setBounds(300, 290, 60, 30);
        mRadio.setBackground(Color.WHITE);
        add(mRadio);
        
         fRadio=new JRadioButton("Female");
         fRadio.setBounds(450, 290, 120, 30);
         fRadio.setBackground(Color.WHITE);
         add(fRadio);
         
         ButtonGroup group=new ButtonGroup();
         group.add(fRadio);
         group.add(mRadio);
         
        JLabel email=new JLabel("Email:");
        email.setFont(new Font("Ralevay",Font.BOLD,20));
        email.setBounds(100, 340, 100, 30);
        add(email);
        
         emailTextField=new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        
        
          JLabel maritalstatus=new JLabel("Marital status:");
        maritalstatus.setFont(new Font("Ralevay",Font.BOLD,20));
        maritalstatus.setBounds(100, 390, 200, 30);
        add(maritalstatus);
        
          married=new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
         unmarried=new JRadioButton("Unmarried");
         unmarried.setBounds(450, 390, 100, 30);
         unmarried.setBackground(Color.WHITE);
         add(unmarried);
         
          others=new JRadioButton("Others");
         others.setBounds(600, 390, 100, 30);
         others.setBackground(Color.WHITE);
         add(others);
         
         ButtonGroup group2=new ButtonGroup();
         group2.add(married);
         group2.add(unmarried);
        
        JLabel address=new JLabel("Address:");
        address.setFont(new Font("Ralevay",Font.BOLD,20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        
          addressTextField=new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        JLabel city=new JLabel("City:");
        city.setFont(new Font("Ralevay",Font.BOLD,20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        
         cityTextField=new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
         JLabel state=new JLabel("State:");
        state.setFont(new Font("Ralevay",Font.BOLD,20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        
         stateTextField=new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        JLabel pin=new JLabel("Pin Code:");
        pin.setFont(new Font("Ralevay",Font.BOLD,20));
        pin.setBounds(100, 590, 200, 30);
        add(pin);
        
         pinTextField=new JTextField();
        pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);
        
         next=new JButton("next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.white);
        setSize(850,800);
        setVisible(true);
        setLocation(350,10);
    }
   @Override
    public void actionPerformed(ActionEvent e) {
        
        String formNumber=""+random;
        String name=nameTextField.getText();
        String fatherName=fathernameTextField.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(mRadio.isSelected())
        {
            gender="Male";
        }else if(fRadio.isSelected())
        {
            gender="Female";
        }
        String email=emailTextField.getText();
        String maritalSt=null;
        if(married.isSelected())
        {
            maritalSt="Married";
        }
        else if(unmarried.isSelected())
        {
           maritalSt="Unmarried"; 
        }
        else if(others.isSelected())
        {
           maritalSt="Others"; 
        }
        String address=addressTextField.getText();
        String city=cityTextField.getText();
        String state=stateTextField.getText();
        String pin=pinTextField.getText();
        
        try{
            if(name.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Name is required");
                
            }
            else if(fatherName.equals(""))
            {
              JOptionPane.showMessageDialog(null, "fatherName is required");  
            }
            else if(dob.equals(""))
            {
              JOptionPane.showMessageDialog(null, "date of birth is required");  
            }
           
            else if(email.equals(""))
            {
              JOptionPane.showMessageDialog(null, "email is required");  
            }
           
            else if(address.equals(""))
            {
              JOptionPane.showMessageDialog(null, "address is required");  
            }
            else if(city.equals(""))
            {
              JOptionPane.showMessageDialog(null, "city is required");  
            }
            else if(state.equals(""))
            {
              JOptionPane.showMessageDialog(null, "state is required");  
            }
            else if(pin.equals(""))
            {
              JOptionPane.showMessageDialog(null, "pin is required");  
            }
            
            
            
            else
            {
                Conn c=new Conn();
                String query="insert into signup values(' "+formNumber+" ', ' "+name+" ', ' "+fatherName+" ', ' "+dob+" ', ' "+gender+" ', ' "+email+" ', ' "+maritalSt+" ', ' "+address+" ',' "+city+" ',' "+state+" ',' "+pin+" ')";
                c.st.executeUpdate(query);
                setVisible(false);
                new Signuptwo(formNumber).setVisible(true);
            }
        } catch(Exception ae){
        
            System.out.println(ae);
        }
        

        
   }
  public static void  main(String args[])
    {
        new SignUpone();
    }

    
}
