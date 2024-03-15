package services;

import enity.Course;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import static services.CourseServices.getPrerequisitesString;
import static services.CourseServices.toArrayListObject;


public class TableAllInformation {
    
    public TableAllInformation(ArrayList<Course> courses,
            String searchKey,
            String choice) {
        this.courses = courses;
        this.searchKey = searchKey;
        this.choice = choice;
    }

    public DefaultTableModel toTable() {
        this.model.addColumn("ID");
        this.model.addColumn("Name");
        this.model.addColumn("Credit");
        this.model.addColumn("GPA");
        this.model.addColumn("Score");
        this.model.addColumn("Status");
        this.model.addColumn("Prerequisites");
        for (Course each : this.courses) {
             if (!searchKey.equals("")) {
                if (choice.equals("ID") && each.getID().contains(searchKey)) {
                    this.model.addRow(createRow(each));
                } else if (choice.equals("NAME") && each.getName().contains(searchKey)) {
                    this.model.addRow(createRow(each));
                }
            } else if (each.getID().contains(searchKey) && each.getName().contains(searchKey)) {
                this.model.addRow(createRow(each));
            }
        }
        return this.model;
    }

    private String[] createRow(Course each) {
        Object[] rowInfo = toArrayListObject(each).toArray();
        rowInfo[4] = !String.valueOf(rowInfo[6]).equalsIgnoreCase("true")? "None":rowInfo[4];
        return new String[]{String.valueOf(rowInfo[0]), 
            String.valueOf(rowInfo[1]), 
            String.valueOf(rowInfo[2]), 
            String.valueOf(rowInfo[4]), 
            String.valueOf(rowInfo[5]) , 
            String.valueOf(rowInfo[6]),
            getPrerequisitesString(each.getPrerequisites())};
    }

    public boolean isCellEditable(int row, int column) {
        return false;
    }

    private String choice;
    private String searchKey;
    private DefaultTableModel model = new DefaultTableModel();
    private ArrayList<Course> courses;
}
