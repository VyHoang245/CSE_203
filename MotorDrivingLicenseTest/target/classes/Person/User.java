/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

import com.mycompany.motordrivinglicensetest.Test;
import java.util.ArrayList;

/**
 *
 * @author vygir
 */
public class User {
    private String name;
    private String pass;
    private boolean admin = false;

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    private ArrayList<Test> list;
    public User(String name, String pass) {
        list = new ArrayList<>();
    }

    public User() {
    }
    public void isAdmin(){
        if(name.compareTo("Admin")==0){
            admin = true;
        }
    }
    
    
    
}
