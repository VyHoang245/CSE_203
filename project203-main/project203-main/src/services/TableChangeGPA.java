package services;

import enity.Course;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import static services.CourseStatusView.*;

public class TableChangeGPA {

    public TableChangeGPA(ArrayList<Course> courses,
            boolean status,
            String searchKey,
            String choice) {
        this.courses = courses;
        this.status = status;
        this.searchKey = searchKey;
        this.choice = choice;
    }

    public DefaultTableModel toTable() {
        this.model.addColumn("ID");
        this.model.addColumn("Name");
        this.model.addColumn("Status");
        this.model.addColumn("GPA");
        for (Course each : this.courses) {
            if (each.isStatus() == status) {
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
        }
        return this.model;
    }

    private String[] createRow(Course each) {
        Object[] rowInfo = toArrayStatusAndGPA(each).toArray();
        return new String[]{String.valueOf(rowInfo[0]), String.valueOf(rowInfo[1]), String.valueOf(rowInfo[2]), String.valueOf(rowInfo[3])};
    }

    public boolean isCellEditable(int row, int column) {
        return false;
    }

    private String choice;
    private String searchKey;
    private boolean status;
    private DefaultTableModel model = new DefaultTableModel();
    private ArrayList<Course> courses;

}
