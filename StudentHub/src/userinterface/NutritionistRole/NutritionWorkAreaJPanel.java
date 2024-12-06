/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NutritionistRole;

//import userinterface.NutritionUnit.*;

import Business.Student.Student;
import Business.Student.StudentDirectory;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.NutritionOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.NutritionistWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.utilities.tableHeaderColors;
import java.awt.CardLayout;
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
public class NutritionWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NutritionWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    NutritionOrganization nutritionOrganisation;
    Enterprise enterprise;
    EcoSystem ecosystem;
    Network network;

    public NutritionWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem business, Network network) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
         this.account = account;
         this.enterprise = enterprise;
         this.ecosystem = business;
         greetLbl.setText(account.getEmployee().getName() + "!!");
         tblStudentList.getTableHeader().setDefaultRenderer(new tableHeaderColors());
         this.network = network;
         populateStudent();
    }
    
    public void populateStudent(){
        DefaultTableModel dtm = (DefaultTableModel) tblStudentList.getModel();
        dtm.setRowCount(0);
        
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
        for(Employee emp : org.getEmployeeDirectory().getEmployeeList()){
            if(emp.toString().equals(account.getEmployee().toString())){
                for( WorkRequest request: account.getWorkQueue().getWorkRequestList()){
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
        AcceptButton = new javax.swing.JButton();
        nameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        txtHeight = new javax.swing.JTextField();
        radioFemale = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ViewDetailsButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        nutriMsgTxt = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        dietChartComboBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        greetLbl = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        viewGoalBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblStudentList.setBackground(new java.awt.Color(204, 204, 204));
        tblStudentList.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        tblStudentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NUID", "Student Name", "Goal", "Status"
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
        if (tblStudentList.getColumnModel().getColumnCount() > 0) {
            tblStudentList.getColumnModel().getColumn(0).setResizable(false);
            tblStudentList.getColumnModel().getColumn(1).setResizable(false);
            tblStudentList.getColumnModel().getColumn(2).setResizable(false);
            tblStudentList.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 675, 91));

        AcceptButton.setBackground(new java.awt.Color(204, 204, 204));
        AcceptButton.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        AcceptButton.setForeground(new java.awt.Color(51, 51, 51));
        AcceptButton.setText("Accept & Process Request");
        AcceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptButtonActionPerformed(evt);
            }
        });
        add(AcceptButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 600, 179, 45));

        nameTxt.setEditable(false);
        nameTxt.setBackground(new java.awt.Color(204, 204, 204));
        nameTxt.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(51, 51, 51));
        add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 150, 30));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 107, 30));

        radioMale.setBackground(new java.awt.Color(51, 51, 51));
        radioMale.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        radioMale.setText("Male");
        radioMale.setEnabled(false);
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });
        add(radioMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 68, -1));

        txtHeight.setEditable(false);
        txtHeight.setBackground(new java.awt.Color(204, 204, 204));
        txtHeight.setForeground(new java.awt.Color(51, 51, 51));
        add(txtHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 150, 30));

        radioFemale.setBackground(new java.awt.Color(51, 51, 51));
        radioFemale.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        radioFemale.setText("Female");
        radioFemale.setEnabled(false);
        radioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemaleActionPerformed(evt);
            }
        });
        add(radioFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 72, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Weight (in Kgs):");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, -1, 30));

        txtWeight.setEditable(false);
        txtWeight.setBackground(new java.awt.Color(204, 204, 204));
        txtWeight.setForeground(new java.awt.Color(51, 51, 51));
        add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 150, 30));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Age:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 90, 30));

        txtAge.setEditable(false);
        txtAge.setBackground(new java.awt.Color(204, 204, 204));
        txtAge.setForeground(new java.awt.Color(51, 51, 51));
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 150, 30));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Gender:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 107, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Height(in cms):");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 86, 30));

        ViewDetailsButton.setBackground(new java.awt.Color(204, 204, 204));
        ViewDetailsButton.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        ViewDetailsButton.setForeground(new java.awt.Color(51, 51, 51));
        ViewDetailsButton.setText("View Details");
        ViewDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetailsButtonActionPerformed(evt);
            }
        });
        add(ViewDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 138, 45));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Message:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, 70));

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(255, 51, 51));
        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Welcome,");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 90, 40));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 40));

        nutriMsgTxt.setBackground(new java.awt.Color(204, 204, 204));
        nutriMsgTxt.setColumns(20);
        nutriMsgTxt.setForeground(new java.awt.Color(51, 51, 51));
        nutriMsgTxt.setRows(5);
        jScrollPane2.setViewportView(nutriMsgTxt);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Diet Chart:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 80, 30));

        dietChartComboBox.setBackground(new java.awt.Color(204, 204, 204));
        dietChartComboBox.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        dietChartComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Weight Gain-1", "Weight Gain-2", "Weight Loss-1", "Weight Loss-2" }));
        add(dietChartComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, 150, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundFoot.png"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 264, 52));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundLogo.png"))); // NOI18N
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 100));

        greetLbl.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        greetLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(greetLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 320, 40));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(102, 204, 255));
        enterpriseLabel.setText("STUDENT DETAILS");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 410, 30));

        viewGoalBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        viewGoalBtn.setText("View Goal");
        viewGoalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewGoalBtnActionPerformed(evt);
            }
        });
        add(viewGoalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 138, 45));
    }// </editor-fold>//GEN-END:initComponents

    private void AcceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AcceptButtonActionPerformed

    private void ViewDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetailsButtonActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_ViewDetailsButtonActionPerformed
   
    private void radioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemaleActionPerformed
        // radioMale.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFemaleActionPerformed

    private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
        // radioFemale.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMaleActionPerformed

    private void viewGoalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewGoalBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewGoalBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptButton;
    private javax.swing.JButton ViewDetailsButton;
    private javax.swing.JComboBox<String> dietChartComboBox;
    private javax.swing.JLabel enterpriseLabel;
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
    private javax.swing.JTextArea nutriMsgTxt;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTable tblStudentList;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JButton viewGoalBtn;
    // End of variables declaration//GEN-END:variables
}
