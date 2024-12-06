/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StoreManager;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ServiceTypes;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MaintenanceWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.utilities.tableHeaderColors;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sumeet
 */
public class ManageServiceJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAcc;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem business;

    /**
     * Creates new form ManageOrderJPanel
     */
    ManageServiceJPanel(JPanel userProcessContainer, Organization organization, EcoSystem business, Enterprise enterprise, UserAccount account) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        orderMgtTbl.getTableHeader().setDefaultRenderer(new tableHeaderColors());
        itemListTbl.getTableHeader().setDefaultRenderer(new tableHeaderColors());
        this.business = business;

        populateTable();
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
        orderMgtTbl = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        viewOrderBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        placeOrderBtn = new javax.swing.JButton();
        assignDelManBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemListTbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        totBillTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orderMgtTbl.setBackground(new java.awt.Color(204, 204, 204));
        orderMgtTbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        orderMgtTbl.setForeground(new java.awt.Color(51, 51, 51));
        orderMgtTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Student Name", "Message", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderMgtTbl);
        if (orderMgtTbl.getColumnModel().getColumnCount() > 0) {
            orderMgtTbl.getColumnModel().getColumn(0).setResizable(false);
            orderMgtTbl.getColumnModel().getColumn(1).setResizable(false);
            orderMgtTbl.getColumnModel().getColumn(2).setResizable(false);
            orderMgtTbl.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 700, 91));

        backBtn.setBackground(new java.awt.Color(204, 204, 204));
        backBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        backBtn.setForeground(new java.awt.Color(51, 51, 51));
        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        viewOrderBtn.setBackground(new java.awt.Color(204, 204, 204));
        viewOrderBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        viewOrderBtn.setForeground(new java.awt.Color(51, 51, 51));
        viewOrderBtn.setText("View Request");
        viewOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderBtnActionPerformed(evt);
            }
        });
        add(viewOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        refreshBtn.setBackground(new java.awt.Color(204, 204, 204));
        refreshBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        refreshBtn.setForeground(new java.awt.Color(51, 51, 51));
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, -1, -1));

        placeOrderBtn.setBackground(new java.awt.Color(204, 204, 204));
        placeOrderBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        placeOrderBtn.setForeground(new java.awt.Color(51, 51, 51));
        placeOrderBtn.setText("Accept Request");
        placeOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderBtnActionPerformed(evt);
            }
        });
        add(placeOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        assignDelManBtn.setBackground(new java.awt.Color(204, 204, 204));
        assignDelManBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        assignDelManBtn.setForeground(new java.awt.Color(51, 51, 51));
        assignDelManBtn.setText("Assign Service Man");
        assignDelManBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignDelManBtnActionPerformed(evt);
            }
        });
        add(assignDelManBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));

        itemListTbl.setBackground(new java.awt.Color(204, 204, 204));
        itemListTbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        itemListTbl.setForeground(new java.awt.Color(51, 51, 51));
        itemListTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(itemListTbl);
        if (itemListTbl.getColumnModel().getColumnCount() > 0) {
            itemListTbl.getColumnModel().getColumn(0).setResizable(false);
            itemListTbl.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 423, 478, 120));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Order Details");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 452, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Total Price:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 108, -1));

        totBillTxt.setEditable(false);
        totBillTxt.setBackground(new java.awt.Color(204, 204, 204));
        totBillTxt.setForeground(new java.awt.Color(51, 51, 51));
        add(totBillTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, 193, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundLogo.png"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 100));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundFoot.png"))); // NOI18N
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 264, 52));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(102, 204, 255));
        enterpriseLabel.setText("Maintenance Request Management");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 440, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void viewOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderMgtTbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        MaintenanceWorkRequest request = (MaintenanceWorkRequest) orderMgtTbl.getValueAt(selectedRow, 2);
        DefaultTableModel dtm = (DefaultTableModel) itemListTbl.getModel();
        dtm.setRowCount(0);

        for (ServiceTypes s : request.getCusList()) {
            Object row[] = new Object[2];
            row[0] = s;
            row[1] = s.getPrice();
            dtm.addRow(row);
        }
        totBillTxt.setText(String.valueOf(request.getTotalBill()));
    }//GEN-LAST:event_viewOrderBtnActionPerformed

    private void placeOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_placeOrderBtnActionPerformed

    private void assignDelManBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignDelManBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_assignDelManBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignDelManBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JTable itemListTbl;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderMgtTbl;
    private javax.swing.JButton placeOrderBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTextField totBillTxt;
    private javax.swing.JButton viewOrderBtn;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) orderMgtTbl.getModel();
        dtm.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                Object[] row = new Object[4];
                int orderID = request.getRequestID();
                row[0] = orderID;
                row[1] = request.getSender().getStudent().getName();
                row[2] = request;
                row[3] = request.getStatus();

                dtm.addRow(row);
            }
        }
    }
}
