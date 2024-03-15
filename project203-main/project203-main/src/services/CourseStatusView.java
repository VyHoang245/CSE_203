package services;

import enity.Course;
import java.util.ArrayList;

public class CourseStatusView {
    
    public static ArrayList<Object> toArrayStatus(Course enity){
        ArrayList<Object> rowInfo = new ArrayList<>();
        rowInfo.add(enity.getID());
        rowInfo.add(enity.getName());
        rowInfo.add((!enity.isStatus())? "not completed": "completed");
        return rowInfo;
    }
    
    public static ArrayList<Object> toArrayStatusAndGPA(Course enity){
        ArrayList<Object> rowInfo = new ArrayList<>();
        rowInfo.add(enity.getID());
        rowInfo.add(enity.getName());
        rowInfo.add((!enity.isStatus())? "not completed": "completed");
        rowInfo.add(enity.getGPA());
        return rowInfo;
    }
      
}
