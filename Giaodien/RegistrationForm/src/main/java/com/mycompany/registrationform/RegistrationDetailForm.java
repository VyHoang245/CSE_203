/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationform;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author vygir
 */
//extend frame
public class RegistrationDetailForm extends JFrame{
    private JTextField nameField, MobileField, addressField;
    private JRadioButton maleButton, femaleButton;
    private JComboBox dayButton, monthButton, yearButton;
    private JCheckBox acceptButton;
    private JButton submitButton, resetButton;
    //create form
    public RegistrationDetailForm(){
        //init form
        setTitle("Registration Form");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        //Layout control
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
        JPanel submitPanel = new JPanel(new GridLayout(2,1));
        JPanel inforPanel = new JPanel(new GridLayout(5,1));
        nameField = new JTextField();
        MobileField = new JTextField();
        addressField = new JTextField();
        maleButton = new JRadioButton();
        femaleButton = new JRadioButton();
        dayButton = new JComboBox();
        monthButton = new JComboBox();
        yearButton = new JComboBox();
        acceptButton = new JCheckBox("Accept Terms And Conditions");
        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");
        //Add layout control to Layout(intputPanel Layout)
        inputPanel.add(new JLabel("Name "));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Mobile "));;
        inputPanel.add(MobileField);
        inputPanel.add(new JLabel("Gender "));
        inforPanel.add(maleButton, femaleButton);
        inputPanel.add(new JLabel("DOB "));
        //inputPanel.add(dayButton,monthButton,yearButton);
        inputPanel.add(new JLabel("Address "));
        inputPanel.add(addressField);
        //Add layout control to Layout(submitPanel Layout)
        submitPanel.add(acceptButton);
        submitPanel.add(submitButton);
        submitPanel.add(resetButton);
        //Add layout control to Layout(inforPanel Layout)
        
        
    }
    
}
