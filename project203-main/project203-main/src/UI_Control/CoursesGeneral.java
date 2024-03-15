package UI_Control;


import java.awt.Image;
import javax.swing.ImageIcon;
import picture.GetImage;
import services.TableAllInformation;
import services.TableAvailable;

public class CoursesGeneral extends javax.swing.JFrame {

    /**
     * Creates new form AvailableCourses
     */
    public CoursesGeneral(MainMenu menu) {
        initComponents();
        this.menu = menu;
        getTableAvaiable("" , "");
        getTableAll("" ,  ""); 
        this.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon(GetImage.class.getResource("courseGeneral_Icon.png"));
        Image image = icon.getImage();
        this.setIconImage(image);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        courseGeneralTabbedPane = new javax.swing.JTabbedPane();
        availablePanel = new javax.swing.JPanel();
        nameCheckRaidoButton = new javax.swing.JRadioButton();
        listAvailableSrollPane = new javax.swing.JScrollPane();
        listAvailable = new javax.swing.JTable();
        idCheckRaidoButton = new javax.swing.JRadioButton();
        jSearchTextField = new UIcomponent.RoundJTextField();
        allCoursePanel = new javax.swing.JPanel();
        nameCheckAllRadioButton = new javax.swing.JRadioButton();
        idCheckAllRadioButton = new javax.swing.JRadioButton();
        allCoursesTable = new javax.swing.JScrollPane();
        allTableCourses = new javax.swing.JTable();
        jSearchAllField = new UIcomponent.RoundJTextField();
        backButton = new UIcomponent.CustomJButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("List of courses you can sign up for");

        courseGeneralTabbedPane.setBackground(new java.awt.Color(2, 30, 68));
        courseGeneralTabbedPane.setForeground(new java.awt.Color(255, 255, 255));
        courseGeneralTabbedPane.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        availablePanel.setBackground(new java.awt.Color(39, 64, 139));

        nameCheckRaidoButton.setBackground(new java.awt.Color(39, 64, 139));
        nameCheckRaidoButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameCheckRaidoButton.setForeground(new java.awt.Color(242, 242, 242));
        nameCheckRaidoButton.setText("Name");
        nameCheckRaidoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameCheckRaidoButtonActionPerformed(evt);
            }
        });

        listAvailable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Credit", "Prerequisites"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        listAvailable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listAvailableMouseClicked(evt);
            }
        });
        listAvailableSrollPane.setViewportView(listAvailable);
        if (listAvailable.getColumnModel().getColumnCount() > 0) {
            listAvailable.getColumnModel().getColumn(3).setMinWidth(200);
            listAvailable.getColumnModel().getColumn(3).setMaxWidth(200);
        }

        idCheckRaidoButton.setBackground(new java.awt.Color(39, 64, 139));
        idCheckRaidoButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idCheckRaidoButton.setForeground(new java.awt.Color(242, 242, 242));
        idCheckRaidoButton.setText("ID");
        idCheckRaidoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCheckRaidoButtonActionPerformed(evt);
            }
        });

        jSearchTextField.setForeground(new java.awt.Color(0, 0, 0));
        jSearchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSearchTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSearchTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jSearchTextFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout availablePanelLayout = new javax.swing.GroupLayout(availablePanel);
        availablePanel.setLayout(availablePanelLayout);
        availablePanelLayout.setHorizontalGroup(
            availablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(availablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(availablePanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(listAvailableSrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(availablePanelLayout.createSequentialGroup()
                        .addGroup(availablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idCheckRaidoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameCheckRaidoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        availablePanelLayout.setVerticalGroup(
            availablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(availablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idCheckRaidoButton)
                    .addGroup(availablePanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(availablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameCheckRaidoButton)
                            .addComponent(jSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listAvailableSrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        courseGeneralTabbedPane.addTab("Available Courses", availablePanel);

        allCoursePanel.setBackground(new java.awt.Color(39, 64, 139));

        nameCheckAllRadioButton.setBackground(new java.awt.Color(39, 64, 139));
        nameCheckAllRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameCheckAllRadioButton.setForeground(new java.awt.Color(242, 242, 242));
        nameCheckAllRadioButton.setText("Name");
        nameCheckAllRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameCheckAllRadioButtonActionPerformed(evt);
            }
        });

        idCheckAllRadioButton.setBackground(new java.awt.Color(39, 64, 139));
        idCheckAllRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idCheckAllRadioButton.setForeground(new java.awt.Color(242, 242, 242));
        idCheckAllRadioButton.setText("ID");
        idCheckAllRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCheckAllRadioButtonActionPerformed(evt);
            }
        });

        allTableCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Credit", "Score", "GPA", "Status", "Prerequisites"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        allTableCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allTableCoursesMouseClicked(evt);
            }
        });
        allCoursesTable.setViewportView(allTableCourses);
        if (allTableCourses.getColumnModel().getColumnCount() > 0) {
            allTableCourses.getColumnModel().getColumn(3).setHeaderValue("TotalScore");
            allTableCourses.getColumnModel().getColumn(6).setMinWidth(200);
            allTableCourses.getColumnModel().getColumn(6).setMaxWidth(200);
        }

        jSearchAllField.setForeground(new java.awt.Color(0, 0, 0));
        jSearchAllField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSearchAllFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSearchAllFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jSearchAllFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout allCoursePanelLayout = new javax.swing.GroupLayout(allCoursePanel);
        allCoursePanel.setLayout(allCoursePanelLayout);
        allCoursePanelLayout.setHorizontalGroup(
            allCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allCoursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(allCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(allCoursePanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(allCoursesTable, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(allCoursePanelLayout.createSequentialGroup()
                        .addGroup(allCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idCheckAllRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameCheckAllRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSearchAllField, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        allCoursePanelLayout.setVerticalGroup(
            allCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allCoursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(allCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idCheckAllRadioButton)
                    .addGroup(allCoursePanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(nameCheckAllRadioButton))
                    .addComponent(jSearchAllField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(allCoursesTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        courseGeneralTabbedPane.addTab("All Courses", allCoursePanel);

        backButton.setForeground(new java.awt.Color(0, 51, 255));
        backButton.setText("Back");
        backButton.setBorderColor(new java.awt.Color(255, 255, 255));
        backButton.setBorderPainted(false);
        backButton.setColorClick(new java.awt.Color(255, 255, 255));
        backButton.setColorOver(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("sansserrif", 1, 14)); // NOI18N
        backButton.setRadius(10);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(courseGeneralTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(courseGeneralTabbedPane)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idCheckRaidoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCheckRaidoButtonActionPerformed
        if (idCheckRaidoButton.isSelected()) {
            nameCheckRaidoButton.setEnabled(false);
        } else {
            nameCheckRaidoButton.setEnabled(true);
        }
    }//GEN-LAST:event_idCheckRaidoButtonActionPerformed

    private void nameCheckRaidoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameCheckRaidoButtonActionPerformed
        if (nameCheckRaidoButton.isSelected()) {
            idCheckRaidoButton.setEnabled(false);
        } else {
            idCheckRaidoButton.setEnabled(true);
        }
    }//GEN-LAST:event_nameCheckRaidoButtonActionPerformed

    private void nameCheckAllRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameCheckAllRadioButtonActionPerformed
        if (nameCheckAllRadioButton.isSelected()) {
            idCheckAllRadioButton.setEnabled(false);
        } else {
            idCheckAllRadioButton.setEnabled(true);
        }
    }//GEN-LAST:event_nameCheckAllRadioButtonActionPerformed

    private void idCheckAllRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCheckAllRadioButtonActionPerformed
        if (idCheckAllRadioButton.isSelected()) {
            nameCheckAllRadioButton.setEnabled(false);
        } else {
            nameCheckAllRadioButton.setEnabled(true);
        }
    }//GEN-LAST:event_idCheckAllRadioButtonActionPerformed

    private void listAvailableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listAvailableMouseClicked
        int row = listAvailable.getSelectedRow();
        new ShowCourseInfo(
                this.menu.UserCourses.getCourse(String.valueOf(listAvailable.getValueAt(row, 0)))).setVisible(true);
    }//GEN-LAST:event_listAvailableMouseClicked

    private void allTableCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allTableCoursesMouseClicked
        int row = allTableCourses.getSelectedRow();
        new ShowCourseInfo(
                this.menu.UserCourses.getCourse(String.valueOf(allTableCourses.getValueAt(row, 0)))).setVisible(true);
    }//GEN-LAST:event_allTableCoursesMouseClicked

    private void jSearchTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchTextFieldKeyPressed
        doSearchStatus();
    }//GEN-LAST:event_jSearchTextFieldKeyPressed

    private void jSearchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchTextFieldKeyReleased
        doSearchStatus();
    }//GEN-LAST:event_jSearchTextFieldKeyReleased

    private void jSearchTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchTextFieldKeyTyped
        doSearchStatus();
    }//GEN-LAST:event_jSearchTextFieldKeyTyped

    private void jSearchAllFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchAllFieldKeyPressed
        doSearchAll();
    }//GEN-LAST:event_jSearchAllFieldKeyPressed

    private void jSearchAllFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchAllFieldKeyReleased
        doSearchAll();
    }//GEN-LAST:event_jSearchAllFieldKeyReleased

    private void jSearchAllFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchAllFieldKeyTyped
        doSearchAll();
    }//GEN-LAST:event_jSearchAllFieldKeyTyped

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.menu.closeMenubar(WIDTH, HEIGHT);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void getTableAvaiable(String choice, String searchKey) {
        listAvailable.setModel(new TableAvailable(this.menu.UserCourses.getArrayCourses(), 
                searchKey, 
                choice)
                .toTable());

    }
    
    private void getTableAll(String choice, String searchKey) {
        allTableCourses.setModel(new TableAllInformation(this.menu.UserCourses.getArrayCourses(), 
                searchKey, 
                choice)
                .toTable());

    }
    
    private void doSearchStatus(){
        if (idCheckRaidoButton.isSelected()) {
            getTableAvaiable("ID", jSearchTextField.getText());
        } else if (nameCheckRaidoButton.isSelected()) {
            getTableAvaiable("NAME", jSearchTextField.getText());
        } else {
            getTableAvaiable("", jSearchTextField.getText());
        }
    }
    
    
    private void doSearchAll(){
        if (idCheckAllRadioButton.isSelected()) {
            getTableAll("ID", jSearchAllField.getText());
        } else if (nameCheckAllRadioButton.isSelected()) {
            getTableAll("NAME", jSearchAllField.getText());
        } else {
            getTableAll("", jSearchAllField.getText());
        }
    }
    /**
     * @param args the command line arguments
     */

    private MainMenu menu;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel allCoursePanel;
    private javax.swing.JScrollPane allCoursesTable;
    private javax.swing.JTable allTableCourses;
    private javax.swing.JPanel availablePanel;
    private UIcomponent.CustomJButton backButton;
    private javax.swing.JTabbedPane courseGeneralTabbedPane;
    private javax.swing.JRadioButton idCheckAllRadioButton;
    private javax.swing.JRadioButton idCheckRaidoButton;
    private UIcomponent.RoundJTextField jSearchAllField;
    private UIcomponent.RoundJTextField jSearchTextField;
    private javax.swing.JTable listAvailable;
    private javax.swing.JScrollPane listAvailableSrollPane;
    private javax.swing.JRadioButton nameCheckAllRadioButton;
    private javax.swing.JRadioButton nameCheckRaidoButton;
    // End of variables declaration//GEN-END:variables
}
