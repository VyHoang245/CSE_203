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
import java.util.ArrayList;

/**
 *
 * @author vygir
 */
public class ListQuestions {
    ArrayList<Question> list;

    public ListQuestions() {
        this.list = loadList();
    }

    public ArrayList<Question> getList() {
        return list;
    }
    public void addQuestion(Question q){
        list.add(q);
        saveList(list);
    }
    
    
    static String fileName = "D:\\list.Dat";
    public static void saveList(ArrayList<Question> list) {
        try {
            FileOutputStream f = new FileOutputStream(fileName);
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            oStream.writeObject(list);
            oStream.close();
        } catch (IOException e) {
            System.out.println("Error save file"+ e.getMessage());
        }
    }

    public static ArrayList<Question> loadList() {
        ArrayList<Question> list= new ArrayList<>();
        try {
            FileInputStream f = new FileInputStream(fileName);
            ObjectInputStream inStream = new ObjectInputStream(f);
            list = (ArrayList<Question>) inStream.readObject();
            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Error load file");
        }
        return list;
    }
}
