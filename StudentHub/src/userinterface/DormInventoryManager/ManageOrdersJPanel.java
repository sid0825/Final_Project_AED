/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DormInventoryManager;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Items;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DormInventoryWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.utilities.tableHeaderColors;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author omkarsalian
 */
public class ManageOrdersJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAcc;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem business;

    /**
     * Creates new form ManageOrderJPanel
     */
    ManageOrdersJPanel(JPanel userProcessContainer, Organization organization, EcoSystem business, Enterprise enterprise, UserAccount account) {
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
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        viewOrderButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        placeOrderButton = new javax.swing.JButton();
        assignDelManButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemListTbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        totBillTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 700, 91));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dorm Inventory Order Management");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 440, 37));

        backButton.setBackground(new java.awt.Color(255, 51, 51));
        backButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(51, 51, 51));
        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        viewOrderButton.setBackground(new java.awt.Color(51, 153, 255));
        viewOrderButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        viewOrderButton.setForeground(new java.awt.Color(255, 255, 255));
        viewOrderButton.setText("View Order");
        viewOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderButtonActionPerformed(evt);
            }
        });
        add(viewOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        refreshButton.setBackground(new java.awt.Color(51, 153, 255));
        refreshButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, -1, -1));

        placeOrderButton.setBackground(new java.awt.Color(51, 153, 255));
        placeOrderButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        placeOrderButton.setForeground(new java.awt.Color(255, 255, 255));
        placeOrderButton.setText("Take Order");
        placeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtonActionPerformed(evt);
            }
        });
        add(placeOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        assignDelManButton.setBackground(new java.awt.Color(51, 153, 255));
        assignDelManButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        assignDelManButton.setForeground(new java.awt.Color(255, 255, 255));
        assignDelManButton.setText("Assign Deliveryman");
        assignDelManButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignDelManButtonActionPerformed(evt);
            }
        });
        add(assignDelManButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, -1, -1));

        itemListTbl.setBackground(new java.awt.Color(204, 204, 204));
        itemListTbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        itemListTbl.setForeground(new java.awt.Color(51, 51, 51));
        itemListTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Price"
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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 478, 93));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Order Details");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 452, -1));

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Total Price:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 108, -1));

        totBillTxt.setEditable(false);
        totBillTxt.setBackground(new java.awt.Color(204, 204, 204));
        totBillTxt.setForeground(new java.awt.Color(51, 51, 51));
        add(totBillTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, 193, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundLogo.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 110, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void viewOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderMgtTbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        DormInventoryWorkRequest request = (DormInventoryWorkRequest) orderMgtTbl.getValueAt(selectedRow, 2);
        DefaultTableModel dtm = (DefaultTableModel) itemListTbl.getModel();
        dtm.setRowCount(0);

        for (Items i : request.getCusList()) {
            Object row[] = new Object[2];
            row[0] = i;
            row[1] = i.getPrice();
            dtm.addRow(row);
        }
        totBillTxt.setText(String.valueOf(request.getTotalBill()));
    }//GEN-LAST:event_viewOrderButtonActionPerformed

    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderMgtTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        DormInventoryWorkRequest request = (DormInventoryWorkRequest) orderMgtTbl.getValueAt(selectedRow, 2);
        if (!(request.getStatus().equals("Order Placed"))) {
            JOptionPane.showMessageDialog(null, "Order already Accepted.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        request.setStatus("Accepted");

        JOptionPane.showMessageDialog(null, "Order accepted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        populateTable();
    }//GEN-LAST:event_placeOrderButtonActionPerformed

    private void assignDelManButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignDelManButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderMgtTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        DormInventoryWorkRequest order1 = (DormInventoryWorkRequest) orderMgtTbl.getValueAt(selectedRow, 2);
        if (order1.getStatus().equalsIgnoreCase("Delivered")) {
            JOptionPane.showMessageDialog(null, "Order has been already Delivered.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (order1.getStatus().equalsIgnoreCase("Out for Delivery")) {
            JOptionPane.showMessageDialog(null, "Deliveryman has been already assigned.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (!order1.getStatus().equalsIgnoreCase("Accepted")) {
            JOptionPane.showMessageDialog(null, "Order is not accepted. Kindly accept the order first to proceed.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        DeliveryManAssignJPanel panel = new DeliveryManAssignJPanel(userProcessContainer, business, enterprise, order1);
        userProcessContainer.add("AssignDeliveryManJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_assignDelManButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignDelManButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTable itemListTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderMgtTbl;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTextField totBillTxt;
    private javax.swing.JButton viewOrderButton;
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
