package enity;

import java.io.Serializable;
import java.util.ArrayList;

public class Course implements Serializable{
    
    
    private String ID;
    private String name;
    private int credit;
    private String Reference;
    private double GPA;
    private double score;
    private boolean status;
    private ArrayList<String> prerequisites; // CSE102 CSE101

    public Course(){
        
    }
    
    public Course(String ID, 
            String name, 
            int credit,
            String Reference, 
            double GPA, 
            double score, 
            boolean status, 
            ArrayList<String> prerequisites) {
        this.ID = ID;
        this.name = name;
        this.credit = credit;
        this.Reference = Reference;
        this.GPA = GPA;
        this.score = score;
        this.status = status;
        this.prerequisites = prerequisites;
    }
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getReference() {
        return Reference;
    }

    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ArrayList<String> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(ArrayList<String> prerequisites) {
        this.prerequisites = prerequisites;
    }
    
    
    
}
