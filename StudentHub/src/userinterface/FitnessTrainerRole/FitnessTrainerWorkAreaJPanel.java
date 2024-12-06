/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FitnessTrainerRole;

import Business.Student.Student;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.NutritionOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FitnessTrainerWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.utilities.tableHeaderColors;
import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author siddheshsawant
 */
public class FitnessTrainerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FitnessTrainerWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    NutritionOrganization nutritionOrganisation;
    Enterprise enterprise;
    EcoSystem ecosystem;
    Network network;

    public FitnessTrainerWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem business, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.ecosystem = business;
        this.network = network;
        greetLbl.setText(account.getEmployee().getName() + "!!");
        tblStudentList.getTableHeader().setDefaultRenderer(new tableHeaderColors());
        populateStudent();
    }

    public void populateStudent() {
        DefaultTableModel dtm = (DefaultTableModel) tblStudentList.getModel();
        dtm.setRowCount(0);

        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (Employee emp : org.getEmployeeDirectory().getEmployeeList()) {
                if (emp.toString().equals(account.getEmployee().toString())) {
                    for (WorkRequest request : account.getWorkQueue().getWorkRequestList()) {
                        Student cust = request.getSender().getStudent();

                        Object[] row = new Object[4];
                        row[0] = cust.getId();
                        row[1] = cust;
                        row[2] = request;
                        row[3] = request.getStatus();
                        dtm.addRow(row);
                    }
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentList = new javax.swing.JTable();
        ProcessButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        ViewDetailsButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        fitnessMsgTxt = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        fitnessChartComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        greetLbl = new javax.swing.JLabel();
        ViewMessageButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblStudentList.setBackground(new java.awt.Color(204, 204, 204));
        tblStudentList.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        tblStudentList.setForeground(new java.awt.Color(51, 51, 51));
        tblStudentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NUID", "Student Name", "Message", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblStudentList);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 675, 91));

        ProcessButton.setBackground(new java.awt.Color(204, 204, 204));
        ProcessButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ProcessButton.setForeground(new java.awt.Color(51, 51, 51));
        ProcessButton.setText("Process Request");
        ProcessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessButtonActionPerformed(evt);
            }
        });
        add(ProcessButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 610, -1, 40));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 107, 30));

        nameTxt.setEditable(false);
        nameTxt.setBackground(new java.awt.Color(204, 204, 204));
        nameTxt.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(51, 51, 51));
        add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 150, 30));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Age:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 90, 30));

        txtAge.setEditable(false);
        txtAge.setBackground(new java.awt.Color(204, 204, 204));
        txtAge.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        txtAge.setForeground(new java.awt.Color(51, 51, 51));
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 150, 30));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Gender:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 107, 20));

        radioMale.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        radioMale.setText("Male");
        radioMale.setEnabled(false);
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });
        add(radioMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 68, -1));

        radioFemale.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        radioFemale.setText("Female");
        radioFemale.setEnabled(false);
        radioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemaleActionPerformed(evt);
            }
        });
        add(radioFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 72, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Height(in cms):");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 86, 30));

        txtHeight.setEditable(false);
        txtHeight.setBackground(new java.awt.Color(204, 204, 204));
        txtHeight.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        txtHeight.setForeground(new java.awt.Color(51, 51, 51));
        add(txtHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 150, 30));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Weight (in Kgs):");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, -1, 30));

        txtWeight.setEditable(false);
        txtWeight.setBackground(new java.awt.Color(204, 204, 204));
        txtWeight.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        txtWeight.setForeground(new java.awt.Color(51, 51, 51));
        add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 150, 30));

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(255, 51, 51));
        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Welcome,");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 90, 40));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 40));

        ViewDetailsButton.setBackground(new java.awt.Color(204, 204, 204));
        ViewDetailsButton.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        ViewDetailsButton.setForeground(new java.awt.Color(51, 51, 51));
        ViewDetailsButton.setText("View Details");
        ViewDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetailsButtonActionPerformed(evt);
            }
        });
        add(ViewDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 138, 45));

        fitnessMsgTxt.setBackground(new java.awt.Color(204, 204, 204));
        fitnessMsgTxt.setColumns(20);
        fitnessMsgTxt.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        fitnessMsgTxt.setForeground(new java.awt.Color(51, 51, 51));
        fitnessMsgTxt.setRows(5);
        jScrollPane2.setViewportView(fitnessMsgTxt);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Message:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 80, 30));

        fitnessChartComboBox.setBackground(new java.awt.Color(204, 204, 204));
        fitnessChartComboBox.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        fitnessChartComboBox.setForeground(new java.awt.Color(51, 51, 51));
        fitnessChartComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fitness Chart-1", "Fitness Chart-2" }));
        add(fitnessChartComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 150, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Fitness Chart:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 80, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundLogo.png"))); // NOI18N
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 100));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundFoot.png"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 264, 52));

        greetLbl.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        greetLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(greetLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 320, 50));

        ViewMessageButton.setBackground(new java.awt.Color(204, 204, 204));
        ViewMessageButton.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        ViewMessageButton.setForeground(new java.awt.Color(51, 51, 51));
        ViewMessageButton.setText("View Message");
        ViewMessageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewMessageButtonActionPerformed(evt);
            }
        });
        add(ViewMessageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 138, 45));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(102, 204, 255));
        enterpriseLabel.setText("STUDENT DETAILS");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 270, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
        radioFemale.setEnabled(false);
    }//GEN-LAST:event_radioMaleActionPerformed

    private void radioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemaleActionPerformed
        radioMale.setEnabled(false);
    }//GEN-LAST:event_radioFemaleActionPerformed

    private void ProcessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessButtonActionPerformed

    }//GEN-LAST:event_ProcessButtonActionPerformed

    private void ViewDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetailsButtonActionPerformed
        int selectedRow = tblStudentList.getSelectedRow();
        if (selectedRow >= 0) {
            Student student = (Student) tblStudentList.getValueAt(selectedRow, 1);
            nameTxt.setText(student.getName());
            txtAge.setText(String.valueOf(student.getAge()));
            if (student.getGender().toLowerCase().equals("male")) {
                radioMale.setSelected(true);
            } else {
                radioFemale.setSelected(false);
            }
            txtHeight.setText(String.valueOf(student.getHeight()));
            txtWeight.setText(String.valueOf(student.getWeight()));
        } else {
            JOptionPane.showMessageDialog(null, "Please Select a row", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ViewDetailsButtonActionPerformed

    private void ViewMessageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewMessageButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tblStudentList.getModel();
        dtm.setRowCount(0);
        String viewMessage = "";

        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (Employee emp : org.getEmployeeDirectory().getEmployeeList()) {
                if (emp.toString().equals(account.getEmployee().toString())) {
                    for (WorkRequest request : account.getWorkQueue().getWorkRequestList()) {
                        Student cust = request.getSender().getStudent();
                        Object[] row = new Object[4];
                        row[0] = cust.getId();
                        row[1] = cust;
                        row[2] = request;
                        row[3] = request.getStatus();
                        dtm.addRow(row);
                    }
                }
            }
        }

        if (dtm.getRowCount() > 0) {
            viewMessage = "Request: " + dtm.getValueAt(0, 2);
            JOptionPane.showMessageDialog(null, viewMessage, "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ViewMessageButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ProcessButton;
    private javax.swing.JButton ViewDetailsButton;
    private javax.swing.JButton ViewMessageButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JComboBox<String> fitnessChartComboBox;
    private javax.swing.JTextArea fitnessMsgTxt;
    private javax.swing.JLabel greetLbl;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTable tblStudentList;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables

}
