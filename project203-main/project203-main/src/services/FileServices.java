package services;

import enity.Account;
import enity.Course;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.*;
import static org.apache.poi.ss.usermodel.CellType.NUMERIC;
import static org.apache.poi.ss.usermodel.CellType.STRING;
import org.apache.poi.xssf.usermodel.*;

public class FileServices {

    public static void writeFileExcelFromAccount(String name, ArrayList<Course> courses) {
        try {
            File file1 = new File("data\\" + name + ".xlsx");
            FileOutputStream file = new FileOutputStream("data\\" + name + ".xlsx");
            XSSFWorkbook fileExcel = new XSSFWorkbook();
            XSSFSheet data = fileExcel.createSheet("data");
            XSSFRow row;
            XSSFCell cell;
            String[] cata = {"ID", "Name", "Credit", "Reference", "GPA", "Score", "Status", "Prerequisites"};
            row = data.createRow(0);
            for (int j = 0; j <= 7; j++) {
                cell = row.createCell(j);
                cell.setCellValue(cata[j]);
            }
            ArrayList<Object> dataStore;
            int k = 1;
            for (Course each : courses) {
                row = data.createRow(k);
                dataStore = CourseServices.toArrayListObject(each);
                cell = row.createCell(0);
                cell.setCellValue(String.valueOf(dataStore.get(0)));
                cell = row.createCell(1);
                cell.setCellValue(String.valueOf(dataStore.get(1)));
                cell = row.createCell(2);
                cell.setCellValue(Integer.parseInt(String.valueOf(dataStore.get(2))));
                cell = row.createCell(3);
                cell.setCellValue(String.valueOf(dataStore.get(3)));
                cell = row.createCell(4);
                cell.setCellValue(Double.parseDouble(String.valueOf(dataStore.get(4))));
                cell = row.createCell(5);
                cell.setCellValue(Double.parseDouble(String.valueOf(dataStore.get(5))));
                cell = row.createCell(6);
                cell.setCellValue((boolean)dataStore.get(6));
                cell = row.createCell(7);
                cell.setCellValue(String.valueOf(dataStore.get(7)));
                k++;
            }
            try {
                fileExcel.write(file);
                file.close();
            } catch (IOException ex) {
            }
        } catch (FileNotFoundException ex) {
        }
    }

    public static ArrayList<Course> readFileExcelToAccount(String name) {
        try {
            ArrayList<Course> courses = new ArrayList<>();
            FileInputStream file = new FileInputStream("data\\" + name + ".xlsx");
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheet("data");
            FormulaEvaluator formula = wb.getCreationHelper().createFormulaEvaluator();
            int i = 0;
            for (Row row : sheet) {
                if (i == 0) {
                    i = 1;
                    continue;
                }
                ArrayList<Object> information = new ArrayList<>();
                int h = 1;
                for (Cell cell : row) {
                    CellType z = formula.evaluate(cell).getCellType();
                    switch (z) {
                        case STRING:
                            information.add(cell.getStringCellValue());
                            break;
                        case NUMERIC:
                            information.add(cell.getNumericCellValue());
                            break;
                        case BOOLEAN:
                            information.add(cell.getBooleanCellValue());
                            break;
                    }
                }
                ArrayList<String> tempt = new ArrayList<>();
                String prerequisites = String.valueOf(information.get(7));
                for (int j = 0; j < prerequisites.split(" ").length; j++) {
                    tempt.add(prerequisites.split(" ")[j]);
                }
                Course course = new Course(String.valueOf(information.get(0)),
                        String.valueOf(information.get(1)),
                        (int) Double.parseDouble(String.valueOf(information.get(2))),
                        String.valueOf(information.get(3)),
                        Double.parseDouble(String.valueOf(information.get(4))),
                        Double.parseDouble(String.valueOf(information.get(5))),
                        (boolean)information.get(6),
                        tempt);
                courses.add(course);
            }
            return courses;
        } catch (IOException ex) {
        }
        return null;
    }

    public static void copyExcelFileFromSourseFile(String pathSourse , String name) {
        try {
            File sourse = new File(pathSourse);
            File des = new File("data\\" + name + ".xlsx");
            checkIfFolderExistToCreate("data\\" + name + ".xlsx");
            FileUtils.copyFile(sourse, des);

        } catch (Exception ex) {
        }
    }

    public static void checkIfFolderExistToCreate(String path) {
        File file = new File(path);
        File folder = new File(file.getParent());
        if (!folder.exists()) {
            folder.mkdirs();
        } else if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
            }
        }
    }

    public static void writeAccountToExcel(Account acc, boolean status) {
        FileOutputStream file = null;
        try {
            File file1 = new File("account.xlsx");
            FileInputStream fis = new FileInputStream("account.xlsx");
            XSSFWorkbook fileExcel = new XSSFWorkbook(fis);
            XSSFSheet data;
            XSSFRow row;
            XSSFCell cell;
            int totalRow;
            data = fileExcel.getSheet("data");
            totalRow = data.getLastRowNum();
            row = data.createRow(totalRow + 1);
            cell = row.createCell(0);
            cell.setCellValue(acc.getUserID());
            cell = row.createCell(1);
            cell.setCellValue(acc.getUsername());
            cell = row.createCell(2);
            cell.setCellValue(acc.getPassword());
            cell = row.createCell(3);
            cell.setCellValue(acc.getFullName());
            cell = row.createCell(4);
            cell.setCellValue(acc.getYearAttend());
            cell = row.createCell(5);
            cell.setCellValue(acc.getStudentID());
            cell = row.createCell(6);
            cell.setCellValue(acc.isGender());
            fis.close();
            file = new FileOutputStream("account.xlsx");
            fileExcel.write(file);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileServices.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {

        } finally {
            try {
                file.close();
            } catch (IOException ex) {

            }
        }
    }

    public static ArrayList<Account> readAllAccountsExcel() {
        FileInputStream file = null;
        ArrayList<Account> accounts = new ArrayList<>();
        try {
            file = new FileInputStream("account.xlsx");
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheet("data");
            FormulaEvaluator formula = wb.getCreationHelper().createFormulaEvaluator();

            for (Row row : sheet) {
                int h = 0;
                ArrayList<Object> information = new ArrayList<>();
                for (Cell cell : row) {
                    if (h == 0) {
                        h++;
                        continue;
                    }
                    CellType z = formula.evaluate(cell).getCellType();
                    switch (z) {
                        case STRING:
                            String tempt = cell.getStringCellValue();
                            information.add(tempt);
                            break;
                        case NUMERIC:
                            int num = (int) cell.getNumericCellValue();
                            information.add(num);
                            break;
                        case BOOLEAN:
                            boolean temptGender = cell.getBooleanCellValue();
                            information.add(temptGender);
                            break;
                    }
                }
                boolean gender = (boolean) information.get(5);
                int yearAttend = (int) information.get(3);
                String username = String.valueOf(information.get(0));
                String password = String.valueOf(information.get(1));
                String fullName = String.valueOf(information.get(2));
                String studentID = String.valueOf(information.get(4));
                Account acc = new Account(username, password, fullName, yearAttend, studentID, gender);
                accounts.add(acc);
                h++;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileServices.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileServices.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(FileServices.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return accounts;
    }

    public static void updateAccount(Account acc, String oldUserID) {
        FileOutputStream fos = null;
        try {
            File file1 = new File("account.xlsx");
            FileInputStream fis = new FileInputStream("account.xlsx");
            XSSFWorkbook fileExcel = new XSSFWorkbook(fis);
            XSSFSheet data;
            XSSFRow row;
            XSSFCell cell;
            int totalRow;
            data = fileExcel.getSheet("data");
            for (Row eachRow : data) {
                Cell cellRowCheck = eachRow.getCell(0);
                String userID = cellRowCheck.getStringCellValue();
                if (userID.equals(oldUserID)) {
                    Cell cellRow = eachRow.getCell(0);
                    cellRow.setCellValue(acc.getUserID());
                    cellRow = eachRow.getCell(1);
                    cellRow.setCellValue(acc.getUsername());
                    cellRow = eachRow.getCell(2);
                    cellRow.setCellValue(acc.getPassword());
                    cellRow = eachRow.getCell(3);
                    cellRow.setCellValue(acc.getFullName());
                    cellRow = eachRow.getCell(4);
                    cellRow.setCellValue(acc.getYearAttend());
                    cellRow = eachRow.getCell(5);
                    cellRow.setCellValue(acc.getStudentID());
                    cellRow = eachRow.getCell(6);
                    cellRow.setCellValue(acc.isGender());
                    break;
                }
            }
            fis.close();
            fos = new FileOutputStream("account.xlsx");
            fileExcel.write(fos);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileServices.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {

        } finally {
            try {
                fos.close();
            } catch (IOException ex) {

            }
        }

    }

    public static HashMap<Account, ArrayList<Course>> readAllUsersCourses() {
        HashMap<Account, ArrayList<Course>> usersCourses = new HashMap<>();
        ArrayList<Account> accounts = readAllAccountsExcel();
        for (Account acc : accounts) {
            usersCourses.put(acc, readFileExcelToAccount(acc.getUsername()));
        }
        return usersCourses;
    }

}
