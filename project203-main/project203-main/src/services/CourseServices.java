package services;

import enity.Course;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CourseServices{

    public static ArrayList<Object> toArrayListObject(Course course) {
        ArrayList<Object> tempt = new ArrayList<>();
        tempt.add(course.getID());
        tempt.add(course.getName());
        tempt.add(course.getCredit());
        tempt.add(course.getReference());
        tempt.add(course.getGPA());
        tempt.add(course.getScore());
        tempt.add(course.isStatus());
        tempt.add(getPrerequisitesString(course.getPrerequisites()));
        return tempt;
    }
    
    public static String getPrerequisitesString(ArrayList<String> courses) {
        String result = "";
        for(int i = 0; i < courses.size(); i++){
           result += courses.get(i)+ " ";
        }
        return result;
    } 
    
    public static String getPrerequisitesString(Course course) {
        ArrayList<String> tempt = course.getPrerequisites();
        String result = "";
        for(int i = 0; i < tempt.size(); i++){
           result += tempt.get(i)+ " ";
        }
        return result;
    } 
    
    public static ArrayList<Course> getListCanLearn(ArrayList<Course> courses){
        ArrayList<String> coursesCompleted = getListByStatus(courses, true);
        ArrayList<Course> list = new ArrayList<>();
        for (Course each: courses){
            boolean flag = checkPrerequisites(each, courses);
            if((flag && !each.isStatus()) 
                    || (!each.isStatus() && 
                    each.getPrerequisites().get(0).equalsIgnoreCase("none"))){
                list.add(each);
            }
        }
        Collections.sort(list, new Comparator<Course>(){
            @Override
            public int compare(Course o1, Course o2) {
                return (getTotalScore(o2, courses) > getTotalScore(o1, courses))? 
                        1:getTotalScore(o2, courses) < getTotalScore(o1, courses)?-1:0;
            }
        
    });
        return list;
    }
    
    public static double getTotalScore(Course course, ArrayList<Course> courses){
        double score = course.getScore();
        for (Course each: courses){
            if (each.getPrerequisites().contains(course.getID()) && !each.isStatus()){
                score+=each.getScore();
            }
        }
        return score;
    }
    
    public static ArrayList<String> getListByStatus(ArrayList<Course> courses, boolean status){//List Completed or Incompleted Courses in String
        ArrayList<String> coursesCompleted = new ArrayList<>();
        for (Course each : courses){
            if (each.isStatus() == status){
                coursesCompleted.add(each.getID());
            }
        }
        return coursesCompleted;
    }
    
    public static ArrayList<Course> getListByStatusCourses(ArrayList<Course> courses, boolean status){
        ArrayList<Course> coursesCompleted = new ArrayList<>();
        for (Course each : courses){
            if (each.isStatus() == status){
                coursesCompleted.add(each);
            }
        }
        return coursesCompleted;
    }
    
    
    public static boolean checkPrerequisites(Course course, ArrayList<Course> courses){//check if the prerequisites are completed, in the future users can add courses to the list of theirs
        ArrayList<String> coursesCompleted = getListByStatus(courses, true);
        for (int i = 0; i < course.getPrerequisites().size();i++){
                if ((!coursesCompleted.contains(course.getPrerequisites().get(i)) || course.isStatus()) 
                        && !course.getPrerequisites().get(0).equalsIgnoreCase("None")){
                    return false;
                }
                    
            }
        return true;
    }
    
}
