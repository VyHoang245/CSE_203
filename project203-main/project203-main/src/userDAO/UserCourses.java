package userDAO;

import enity.Account;
import enity.Course;
import java.util.ArrayList;

public class UserCourses extends AllUserProgress {
    private ArrayList<Course> courses;
    private Account acc;
    public ArrayList<Course> getArrayCourses() {
        return courses;
    }

    public void setArrayCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
    public UserCourses(Account acc){
        this.courses = getListCourses(acc);
        this.acc = acc;
    }
    
    public Course getCourse(String id){
        for (Course each : courses){
            if (each.getID().equals(id)){
            return each;
            }
        }
        return null;
    }
    
    public void setCourse(Course course){
        for (int i = 0; i < courses.size(); i++){
            if (courses.get(i).getID().equals(course.getID())){
                this.courses.set(i, course);
            }
        }
        
    }

    @Override
    public Account getAcc() {
        return acc;
    }

    @Override
    public void setAcc(Account acc) {
        this.acc = acc;
    }
}
