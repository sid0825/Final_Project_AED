/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ServiceWorkerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.MaintenanceWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.utilities.tableHeaderColors;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author siddheshsawant
 */
public class ServiceWorkerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem system;
    private EcoSystem business;
    private Enterprise enterprise;

    public ServiceWorkerWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem business, Network network) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise = enterprise;
        greetLbl.setText(account.getEmployee().getName() + "!!");
        delManTbl.getTableHeader().setDefaultRenderer(new tableHeaderColors());
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) delManTbl.getModel();
        dtm.setRowCount(0);
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (WorkRequest request : o.getWorkQueue().getWorkRequestList()) {
                if (request.getReceiver() != null && request.getReceiver().getEmployee().getName().equals(userAccount.getEmployee().getName())) {
                    Object row[] = new Object[4];
                    row[0] = request.getRequestID();
                    row[1] = request.getSender().getStudent().getName();
                    row[2] = request;
                    row[3] = request.getStatus().toString();
                    dtm.addRow(row);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        delManTbl = new javax.swing.JTable();
        CompleteButton = new javax.swing.JButton();
        RefreshButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        greetLbl = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        delManTbl.setBackground(new java.awt.Color(204, 204, 204));
        delManTbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        delManTbl.setForeground(new java.awt.Color(51, 51, 51));
        delManTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Student Name", "Message", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(delManTbl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 730, 130));

        CompleteButton.setBackground(new java.awt.Color(51, 153, 255));
        CompleteButton.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        CompleteButton.setForeground(new java.awt.Color(255, 255, 255));
        CompleteButton.setText("Mark as Completed");
        CompleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CompleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 150, 50));

        RefreshButton.setBackground(new java.awt.Color(51, 153, 255));
        RefreshButton.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        RefreshButton.setForeground(new java.awt.Color(255, 255, 255));
        RefreshButton.setText("Refresh");
        RefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RefreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 120, 30));

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Welcome,");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 120, 40));

        greetLbl.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        greetLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel3.add(greetLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 320, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundLogo.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 110, 100));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(51, 204, 255));
        enterpriseLabel.setText(" SERVICE REQUEST");
        jPanel1.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 410, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CompleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompleteButtonActionPerformed
        int selectedRow = delManTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        MaintenanceWorkRequest request = (MaintenanceWorkRequest) delManTbl.getValueAt(selectedRow, 2);
        if (request.getStatus() == "Completed") {
            JOptionPane.showMessageDialog(null, "The request has been already completed.", "Error", JOptionPane.ERROR_MESSAGE);
            populateTable();
        } else {
            request.setStatus("Completed");
            JOptionPane.showMessageDialog(null, "The request has been completed successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            populateTable();
        }
    }//GEN-LAST:event_CompleteButtonActionPerformed

    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_RefreshButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CompleteButton;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JTable delManTbl;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel greetLbl;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
