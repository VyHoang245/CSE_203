package UI_Control;

import static userDAO.AllUserProgress.*;
import enity.Course;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import picture.GetImage;
import static services.CourseServices.checkPrerequisites;
import static services.CourseServices.getListByStatusCourses;
import services.IconSize_Services;
import services.TableChangeGPA;
import services.TableCoursesStatus;

public class CourseUpdate extends javax.swing.JFrame {

    public CourseUpdate(MainMenu menu) {
        initComponents();
        this.menu = menu;
        getTableIncompleted("", "");
        getTableComplete("", "");
        getTableGPA("", "");
        this.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon(GetImage.class.getResource("courseupdate_icon.png"));
        Image image = icon.getImage();
        this.setIconImage(image);
        this.infoLabel.setIcon(new IconSize_Services("info.png", infoLabel).getIconAsLabelSize());
        this.infoGPAlabel.setIcon(new IconSize_Services("info.png", infoLabel).getIconAsLabelSize());
    }

    private void getTableComplete(String choice, String searchKey) {

        listCompleteCourses.setModel(new TableCoursesStatus(this.menu.UserCourses.getArrayCourses(),
                true,
                searchKey, choice).toTable());

    }

    private void getTableIncompleted(String choice, String searchKey) {
        listIncompleteCourses.setModel(new TableCoursesStatus(this.menu.UserCourses.getArrayCourses(),
                false,
                searchKey, choice).toTable());
    }

    private void getTableGPA(String choice, String searchKey) {
        gpaTable.setModel(new TableChangeGPA(this.menu.UserCourses.getArrayCourses(),
                true,
                searchKey, choice).toTable());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        gpaTab = new javax.swing.JTabbedPane();
        changeCoursesStatusPanel = new javax.swing.JPanel();
        nameChangeStatusRadioButton = new javax.swing.JRadioButton();
        listCompleteScrollPane = new javax.swing.JScrollPane();
        listCompleteCourses = new javax.swing.JTable();
        listInompleteScrollPane = new javax.swing.JScrollPane();
        listIncompleteCourses = new javax.swing.JTable();
        idChangeStatusRadioButton = new javax.swing.JRadioButton();
        jSearchKeyStatusChange = new UIcomponent.RoundJTextField();
        infoLabel = new javax.swing.JLabel();
        changeGPAPanel = new javax.swing.JPanel();
        gpaTableScrollPane = new javax.swing.JScrollPane();
        gpaTable = new javax.swing.JTable();
        statusTextField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        gpaTextField = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        gpaLabel = new javax.swing.JLabel();
        idChangeGPARadioButton = new javax.swing.JRadioButton();
        nameChangeGPARadioButton = new javax.swing.JRadioButton();
        jChangeGPAButton = new javax.swing.JButton();
        jSearchKeyGPA = new UIcomponent.RoundJTextField();
        infoGPAlabel = new javax.swing.JLabel();
        RefreshBt = new UIcomponent.CustomJButton();
        showGPAlabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CHANGE COURSE PROGRESS");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        gpaTab.setBackground(new java.awt.Color(2, 30, 68));
        gpaTab.setForeground(new java.awt.Color(255, 255, 255));
        gpaTab.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        gpaTab.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        changeCoursesStatusPanel.setBackground(new java.awt.Color(2, 31, 68));

        nameChangeStatusRadioButton.setBackground(new java.awt.Color(2, 29, 68));
        nameChangeStatusRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameChangeStatusRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        nameChangeStatusRadioButton.setText("Name");
        nameChangeStatusRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameChangeStatusRadioButtonActionPerformed(evt);
            }
        });

        listCompleteCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        listCompleteCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listCompleteCoursesMouseClicked(evt);
            }
        });
        listCompleteScrollPane.setViewportView(listCompleteCourses);

        listIncompleteCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        listIncompleteCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listIncompleteCoursesMouseClicked(evt);
            }
        });
        listInompleteScrollPane.setViewportView(listIncompleteCourses);

        idChangeStatusRadioButton.setBackground(new java.awt.Color(2, 31, 68));
        idChangeStatusRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idChangeStatusRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        idChangeStatusRadioButton.setText("ID");
        idChangeStatusRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idChangeStatusRadioButtonActionPerformed(evt);
            }
        });

        jSearchKeyStatusChange.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSearchKeyStatusChangeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSearchKeyStatusChangeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jSearchKeyStatusChangeKeyTyped(evt);
            }
        });

        infoLabel.setText("info");
        infoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout changeCoursesStatusPanelLayout = new javax.swing.GroupLayout(changeCoursesStatusPanel);
        changeCoursesStatusPanel.setLayout(changeCoursesStatusPanelLayout);
        changeCoursesStatusPanelLayout.setHorizontalGroup(
            changeCoursesStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeCoursesStatusPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(changeCoursesStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changeCoursesStatusPanelLayout.createSequentialGroup()
                        .addComponent(listInompleteScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(listCompleteScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(changeCoursesStatusPanelLayout.createSequentialGroup()
                        .addGroup(changeCoursesStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameChangeStatusRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idChangeStatusRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSearchKeyStatusChange, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(infoLabel)
                        .addGap(158, 158, 158))))
        );
        changeCoursesStatusPanelLayout.setVerticalGroup(
            changeCoursesStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeCoursesStatusPanelLayout.createSequentialGroup()
                .addGroup(changeCoursesStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changeCoursesStatusPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nameChangeStatusRadioButton))
                    .addGroup(changeCoursesStatusPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(changeCoursesStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(changeCoursesStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSearchKeyStatusChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(idChangeStatusRadioButton))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(changeCoursesStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listCompleteScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listInompleteScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        gpaTab.addTab("Change Courses Status", changeCoursesStatusPanel);

        changeGPAPanel.setBackground(new java.awt.Color(2, 31, 68));
        changeGPAPanel.setForeground(new java.awt.Color(255, 255, 255));

        gpaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        gpaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gpaTableMouseClicked(evt);
            }
        });
        gpaTableScrollPane.setViewportView(gpaTable);

        statusTextField.setEditable(false);
        statusTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        statusTextField.setText("Completed");

        idTextField.setEditable(false);

        nameTextField.setEditable(false);

        gpaTextField.setBorder(null);

        idLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(255, 255, 255));
        idLabel.setText("ID");

        nameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name");

        statusLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(255, 255, 255));
        statusLabel.setText("Status");

        gpaLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        gpaLabel.setForeground(new java.awt.Color(255, 255, 255));
        gpaLabel.setText("GPA");

        idChangeGPARadioButton.setBackground(new java.awt.Color(2, 31, 68));
        idChangeGPARadioButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idChangeGPARadioButton.setForeground(new java.awt.Color(255, 255, 255));
        idChangeGPARadioButton.setText("ID");
        idChangeGPARadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idChangeGPARadioButtonActionPerformed(evt);
            }
        });

        nameChangeGPARadioButton.setBackground(new java.awt.Color(2, 31, 68));
        nameChangeGPARadioButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameChangeGPARadioButton.setForeground(new java.awt.Color(255, 255, 255));
        nameChangeGPARadioButton.setText("Name");
        nameChangeGPARadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameChangeGPARadioButtonActionPerformed(evt);
            }
        });

        jChangeGPAButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jChangeGPAButton.setText("Apply Change");
        jChangeGPAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChangeGPAButtonActionPerformed(evt);
            }
        });

        jSearchKeyGPA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSearchKeyGPAKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSearchKeyGPAKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jSearchKeyGPAKeyTyped(evt);
            }
        });

        infoGPAlabel.setText("info");
        infoGPAlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoGPAlabelMouseClicked(evt);
            }
        });

        RefreshBt.setForeground(new java.awt.Color(0, 0, 0));
        RefreshBt.setText("Refresh");
        RefreshBt.setFont(new java.awt.Font("sansserrif", 1, 14)); // NOI18N
        RefreshBt.setRadius(10);
        RefreshBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBtActionPerformed(evt);
            }
        });

        showGPAlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        showGPAlabel.setForeground(new java.awt.Color(255, 255, 255));
        showGPAlabel.setText("Click here to see GPA!!!");
        showGPAlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showGPAlabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout changeGPAPanelLayout = new javax.swing.GroupLayout(changeGPAPanel);
        changeGPAPanel.setLayout(changeGPAPanelLayout);
        changeGPAPanelLayout.setHorizontalGroup(
            changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeGPAPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changeGPAPanelLayout.createSequentialGroup()
                        .addComponent(gpaTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(changeGPAPanelLayout.createSequentialGroup()
                                .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(changeGPAPanelLayout.createSequentialGroup()
                                        .addComponent(gpaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(statusTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gpaTextField)
                                    .addComponent(idTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(65, 65, 65))
                            .addGroup(changeGPAPanelLayout.createSequentialGroup()
                                .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(showGPAlabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(changeGPAPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                                        .addComponent(jChangeGPAButton)))
                                .addGap(134, 134, 134))))
                    .addGroup(changeGPAPanelLayout.createSequentialGroup()
                        .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idChangeGPARadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameChangeGPARadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSearchKeyGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(infoGPAlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(RefreshBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        changeGPAPanelLayout.setVerticalGroup(
            changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeGPAPanelLayout.createSequentialGroup()
                .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changeGPAPanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idChangeGPARadioButton)
                            .addGroup(changeGPAPanelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(nameChangeGPARadioButton))
                            .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSearchKeyGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(infoGPAlabel))))
                    .addGroup(changeGPAPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RefreshBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changeGPAPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idLabel))
                        .addGap(18, 18, 18)
                        .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(statusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusLabel))
                        .addGap(18, 18, 18)
                        .addGroup(changeGPAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gpaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gpaLabel))
                        .addGap(34, 34, 34)
                        .addComponent(jChangeGPAButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(showGPAlabel))
                    .addComponent(gpaTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        gpaTab.addTab("Change GPA", changeGPAPanel);

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(gpaTab, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(44, 44, 44))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gpaTab, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listIncompleteCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listIncompleteCoursesMouseClicked
        int row = listIncompleteCourses.getSelectedRow();       // click on listIncompleted change courses to the listCompleted
        ArrayList<Course> tempt = getListByStatusCourses(this.menu.UserCourses.getArrayCourses(), true);
        DefaultTableModel completedTable = (DefaultTableModel) listCompleteCourses.getModel();
        for (int i = 0; i < completedTable.getRowCount(); i++) {
            String id = String.valueOf(completedTable.getValueAt(i, 0));
            Course temptCourse = new Course();
            temptCourse = this.menu.UserCourses.getCourse(id);
            temptCourse.setStatus(true);
            tempt.add(temptCourse);
        }

        if (checkPrerequisites(this.menu.UserCourses.getCourse(String.valueOf(listIncompleteCourses.getValueAt(row, 0))),
                tempt)) {// check prerequisites including current list completed table
            changeStatus(listIncompleteCourses, listCompleteCourses, true, row);
        } else {
            JOptionPane.showMessageDialog(this, "You didn't complete the courses prerequisites");
        }
        applyCurrentProgress();
        getTableGPA("", "");

    }//GEN-LAST:event_listIncompleteCoursesMouseClicked

    private void listCompleteCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listCompleteCoursesMouseClicked
        int row = listCompleteCourses.getSelectedRow();
        changeStatus(listCompleteCourses, listIncompleteCourses, false, row);
        applyCurrentProgress();
        getTableGPA("", "");
    }//GEN-LAST:event_listCompleteCoursesMouseClicked

    private void changeStatus(javax.swing.JTable tableRemoveRow,
            javax.swing.JTable tableAddRow,
            boolean statusChange,
            int row) {
        Object[] selectedRow = new Object[3];
        DefaultTableModel tabl = (DefaultTableModel) tableRemoveRow.getModel();
        selectedRow[0] = tableRemoveRow.getValueAt(row, 0);
        selectedRow[1] = tableRemoveRow.getValueAt(row, 1);
        selectedRow[2] = (statusChange) ? "completed" : "not completed";
        tabl.removeRow(row);
        DefaultTableModel table = (DefaultTableModel) tableAddRow.getModel();
        tableAddRow.setModel(table);
        table.addRow(selectedRow);
    }

    private void applyCurrentProgress() {
        DefaultTableModel unComplete = (DefaultTableModel) listIncompleteCourses.getModel();
        for (int i = 0; i < unComplete.getRowCount(); i++) {
            String id = String.valueOf(unComplete.getValueAt(i, 0));
            changeStatus(false, id);
        }

        DefaultTableModel complete = (DefaultTableModel) listCompleteCourses.getModel();
        for (int i = 0; i < complete.getRowCount(); i++) {
            String id = String.valueOf(complete.getValueAt(i, 0));
            changeStatus(true, id);
        }
//        setCourses(this.menu.acc, this.menu.UserCourses.getArrayCourses());
    }

    private void changeStatus(boolean status, String id) {
        this.menu.UserCourses.getCourse(id).setStatus(status);
    }


    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
        this.menu.closeMenubar(WIDTH, HEIGHT);
    }//GEN-LAST:event_backButtonActionPerformed

    private void idChangeStatusRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idChangeStatusRadioButtonActionPerformed
        if (idChangeStatusRadioButton.isSelected()) {
            nameChangeStatusRadioButton.setEnabled(false);
        } else {
            nameChangeStatusRadioButton.setEnabled(true);
        }
    }//GEN-LAST:event_idChangeStatusRadioButtonActionPerformed

    private void nameChangeStatusRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameChangeStatusRadioButtonActionPerformed
        if (nameChangeStatusRadioButton.isSelected()) {
            idChangeStatusRadioButton.setEnabled(false);
        } else {
            idChangeStatusRadioButton.setEnabled(true);
        }
    }//GEN-LAST:event_nameChangeStatusRadioButtonActionPerformed

    private void doSearchStatus() {
        if (idChangeStatusRadioButton.isSelected()) {
            getTableComplete("ID", jSearchKeyStatusChange.getText());
            getTableIncompleted("ID", jSearchKeyStatusChange.getText());
        } else if (nameChangeStatusRadioButton.isSelected()) {
            getTableComplete("NAME", jSearchKeyStatusChange.getText());
            getTableIncompleted("NAME", jSearchKeyStatusChange.getText());
        } else {
            getTableComplete("", jSearchKeyStatusChange.getText());
            getTableIncompleted("", jSearchKeyStatusChange.getText());
        }
    }

    private void gpaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gpaTableMouseClicked
        int row = gpaTable.getSelectedRow();
        Object[] selectedRow = new Object[4];
        DefaultTableModel tabl = (DefaultTableModel) listCompleteCourses.getModel();
        selectedRow[0] = gpaTable.getValueAt(row, 0);
        selectedRow[1] = gpaTable.getValueAt(row, 1);
        selectedRow[2] = "Completed";
        selectedRow[3] = gpaTable.getValueAt(row, 3);
        idTextField.setText(String.valueOf(selectedRow[0]));
        nameTextField.setText(String.valueOf(selectedRow[1]));
        gpaTextField.setText(String.valueOf(selectedRow[3]));
    }//GEN-LAST:event_gpaTableMouseClicked

    private void idChangeGPARadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idChangeGPARadioButtonActionPerformed
        if (idChangeGPARadioButton.isSelected()) {
            nameChangeGPARadioButton.setEnabled(false);
        } else {
            nameChangeGPARadioButton.setEnabled(true);
        }
    }//GEN-LAST:event_idChangeGPARadioButtonActionPerformed

    private void nameChangeGPARadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameChangeGPARadioButtonActionPerformed
        if (nameChangeGPARadioButton.isSelected()) {
            idChangeGPARadioButton.setEnabled(false);
        } else {
            idChangeGPARadioButton.setEnabled(true);
        }
    }//GEN-LAST:event_nameChangeGPARadioButtonActionPerformed

    private void doSearchGPA() {
        if (idChangeGPARadioButton.isSelected()) {
            getTableGPA("ID", jSearchKeyGPA.getText());
        } else if (nameChangeGPARadioButton.isSelected()) {
            getTableGPA("NAME", jSearchKeyGPA.getText());
        } else {
            getTableGPA("", jSearchKeyGPA.getText());
        }
    }

    private void jChangeGPAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChangeGPAButtonActionPerformed
        if (!idTextField.getText().equals("") && idTextField.getText() != null) {
            Course course = this.menu.UserCourses.getCourse(idTextField.getText());
            try {
                double GPA = Double.parseDouble(gpaTextField.getText());
                if (GPA <= 4
                        && GPA >= 0) {
                    course.setGPA(GPA);
                    this.menu.UserCourses.setCourse(course);
                    setCourses(this.menu.acc, this.menu.UserCourses.getArrayCourses());
                } else {
                    JOptionPane.showMessageDialog(this, "GPA must be under 4.0 and over 0!!!!");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "GPA must be a number");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Choose at least one course to change");
        }
    }//GEN-LAST:event_jChangeGPAButtonActionPerformed

    private void jSearchKeyStatusChangeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchKeyStatusChangeKeyPressed
        doSearchStatus();
    }//GEN-LAST:event_jSearchKeyStatusChangeKeyPressed

    private void jSearchKeyStatusChangeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchKeyStatusChangeKeyReleased
        doSearchStatus();
    }//GEN-LAST:event_jSearchKeyStatusChangeKeyReleased

    private void jSearchKeyStatusChangeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchKeyStatusChangeKeyTyped
        doSearchStatus();
    }//GEN-LAST:event_jSearchKeyStatusChangeKeyTyped

    private void jSearchKeyGPAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchKeyGPAKeyPressed
        doSearchGPA();
    }//GEN-LAST:event_jSearchKeyGPAKeyPressed

    private void jSearchKeyGPAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchKeyGPAKeyReleased
        doSearchGPA();
    }//GEN-LAST:event_jSearchKeyGPAKeyReleased

    private void jSearchKeyGPAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchKeyGPAKeyTyped
        doSearchGPA();
    }//GEN-LAST:event_jSearchKeyGPAKeyTyped

    private void infoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoLabelMouseClicked
        JOptionPane.showMessageDialog(this, "Click on the course which you have completed or not completed to change its status", 
                "Instructions", JOptionPane.OK_OPTION, new ImageIcon(GetImage.class.getResource("info.png")));
    }//GEN-LAST:event_infoLabelMouseClicked

    private void infoGPAlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoGPAlabelMouseClicked
        JOptionPane.showMessageDialog(this, "Click on the course which you have completed to update GPA", 
                "Instructions", JOptionPane.OK_OPTION, new ImageIcon(GetImage.class.getResource("info.png")));
    }//GEN-LAST:event_infoGPAlabelMouseClicked

    private void RefreshBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtActionPerformed
        getTableGPA("", "");
    }//GEN-LAST:event_RefreshBtActionPerformed

    private void showGPAlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showGPAlabelMouseClicked
        new AccountInformation(this.menu.acc).setVisible(true);
    }//GEN-LAST:event_showGPAlabelMouseClicked

    private MainMenu menu;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private UIcomponent.CustomJButton RefreshBt;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel changeCoursesStatusPanel;
    private javax.swing.JPanel changeGPAPanel;
    private javax.swing.JLabel gpaLabel;
    private javax.swing.JTabbedPane gpaTab;
    private javax.swing.JTable gpaTable;
    private javax.swing.JScrollPane gpaTableScrollPane;
    private javax.swing.JTextField gpaTextField;
    private javax.swing.JRadioButton idChangeGPARadioButton;
    private javax.swing.JRadioButton idChangeStatusRadioButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel infoGPAlabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JButton jChangeGPAButton;
    private javax.swing.JPanel jPanel3;
    private UIcomponent.RoundJTextField jSearchKeyGPA;
    private UIcomponent.RoundJTextField jSearchKeyStatusChange;
    private javax.swing.JTable listCompleteCourses;
    private javax.swing.JScrollPane listCompleteScrollPane;
    private javax.swing.JTable listIncompleteCourses;
    private javax.swing.JScrollPane listInompleteScrollPane;
    private javax.swing.JRadioButton nameChangeGPARadioButton;
    private javax.swing.JRadioButton nameChangeStatusRadioButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel showGPAlabel;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTextField statusTextField;
    // End of variables declaration//GEN-END:variables
}
