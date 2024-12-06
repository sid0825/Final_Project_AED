/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StoreManager;

import Business.EcoSystem;
import Business.StudentRequestOrder;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MaintenanceWorkRequest;
import java.awt.CardLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sumeet
 */
public class ServiceManAssignJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private StudentRequestOrder order;
    private EcoSystem business;
    private Enterprise enterprise;
    private MaintenanceWorkRequest request;

    /**
     * Creates new form DeliveryManAssignJPanel
     */
    ServiceManAssignJPanel(JPanel userProcessContainer, EcoSystem business, Enterprise enterprise, MaintenanceWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.request = request;
        this.enterprise = enterprise;
        populateComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        deliveryManCmbBox = new javax.swing.JComboBox<>();
        appointDelManBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBtn.setBackground(new java.awt.Color(204, 204, 204));
        backBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        backBtn.setForeground(new java.awt.Color(51, 51, 51));
        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 82, 37));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Servicemen");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 151, -1));

        deliveryManCmbBox.setBackground(new java.awt.Color(204, 204, 204));
        deliveryManCmbBox.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        deliveryManCmbBox.setForeground(new java.awt.Color(51, 51, 51));
        deliveryManCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        deliveryManCmbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryManCmbBoxActionPerformed(evt);
            }
        });
        add(deliveryManCmbBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 150, 30));

        appointDelManBtn.setBackground(new java.awt.Color(204, 204, 204));
        appointDelManBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        appointDelManBtn.setForeground(new java.awt.Color(51, 51, 51));
        appointDelManBtn.setText("Assign");
        appointDelManBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointDelManBtnActionPerformed(evt);
            }
        });
        add(appointDelManBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 95, 36));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundLogo.png"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 100));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundFoot.png"))); // NOI18N
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 264, 52));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 51, 51));
        enterpriseLabel.setText("Assign Serviceman");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 410, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_backBtnActionPerformed

    private void appointDelManBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointDelManBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_appointDelManBtnActionPerformed

    private void deliveryManCmbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryManCmbBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deliveryManCmbBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appointDelManBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> deliveryManCmbBox;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    private void populateComboBox() {
        DefaultComboBoxModel dm = new DefaultComboBoxModel();
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount e : o.getUserAccountDirectory().getUserAccountList()) {
                if (e.getRole().toString().equals("Business.Role.ServiceWorkerRole")) {
                    dm.addElement(e.getEmployee().getName());
                    deliveryManCmbBox.setModel(dm);
                }
            }
        }
    }
}
