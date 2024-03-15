/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motordrivinglicensetest;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
/**
 *
 * @author vygir
 */
public class Test {
    ArrayList<Question> list;
    private String testNumber;

    public String getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(String testNumber) {
        this.testNumber = testNumber;
    }
    
    public Test(String number, ListQuestions qus) {
        list = new ArrayList<>();
        this.testNumber = number;
    }

    public ArrayList<Question> getList() {
        return list;
    }

}
