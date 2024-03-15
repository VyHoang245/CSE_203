package services;

import userDAO.AllUserProgress;
import static userDAO.AllUserProgress.getListAccounts;
import enity.Account;
import enity.Course;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import static services.FileServices.updateAccount;

public class AccountServices {

    public static void addAccount(String username, String password, String fullName, int yearAttend, String studentID, boolean gender) {
        Account acc = new Account(username, password, fullName, yearAttend, studentID, gender);
        FileServices.copyExcelFileFromSourseFile("course.xlsx", username);
        ArrayList<Account> listAccounts = AllUserProgress.getListAccounts();
        listAccounts.add(acc);
        FileServices.writeAccountToExcel(acc, true);
        AllUserProgress.data = FileServices.readAllUsersCourses();
    }

    public static void updateAccountInformation(Account acc, String oldUserID, String oldUsername) {
        FileServices.copyExcelFileFromSourseFile("data\\" + oldUsername + ".xlsx", acc.getUsername());
        File fileDelete = new File("data\\" + oldUsername + ".xlsx");
        updateAccount(acc, oldUserID);
        if (!acc.getUsername().equals(oldUsername)) {
            fileDelete.deleteOnExit();
        }
        AllUserProgress.data = FileServices.readAllUsersCourses();
    }

    public static Account getAccount(String username) {
        for (Account each : getListAccounts()) {
            if (each.getUsername().equals(username)) {
                return each;
            }
        }
        return null;
    }

    public static Account getAccountByStudentID(String studentID) {
        for (Account each : getListAccounts()) {
            if (each.getStudentID().equals(studentID)) {
                return each;
            }
        }
        return null;
    }

    public static boolean checkAccountExisted(String username) {
        Set<Account> accounts = AllUserProgress.data.keySet();
        for (Account acc : accounts) {
            if (acc.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
    
    public static double getAccountGPA(ArrayList<Course> courses){
        double GPA = 0;
        int credit = 0;
        for (Course each: courses){
            GPA += each.getGPA()*each.getCredit();
            credit += each.getCredit();
        }
        return (double) GPA/credit;
    }
}
