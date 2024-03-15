package enity;

import java.io.Serializable;


public class Account implements Serializable{
    private String username;
    private String password;
    private String fullName;
    private int yearAttend;
    private String studentID;
    private boolean gender;
    private String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    
    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearAttend() {
        return yearAttend;
    }

    public void setYearAttend(int yearAttend) {
        this.yearAttend = yearAttend;
    }
   
    public Account(String username, 
            String password, 
            String fullName, 
            int yearAttend, 
            String studentID, 
            boolean gender) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.yearAttend = yearAttend;
        this.studentID = studentID;
        this.gender = gender;
        this.userID = "user" + studentID;
    }
 
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
     
}
