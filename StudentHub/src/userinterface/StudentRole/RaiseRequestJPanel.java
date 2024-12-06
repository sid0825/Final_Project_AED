/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StudentRole;

import Business.Student.Student;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.MaintenanceEnterprise;
import Business.Enterprise.ServiceTypes;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.ServiceOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.utilities.tableHeaderColors;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.WorkQueue.MaintenanceWorkRequest;

/**
 *
 * @author siddheshsawant
 */
public class RaiseRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem business;
    private Enterprise enterprise;
    private int cartCount = 0;
    private String total;
    private int itemCount = 0;
    private ArrayList<ServiceTypes> cusList;
    private ArrayList<ServiceTypes> histList;
    private Student student;
    private Network network;

    /**
     * Creates new form RaiseRequestJPanel
     */
    public RaiseRequestJPanel(JPanel userProcessContainer, Student student, EcoSystem system, UserAccount userAccount, Enterprise enterprise, Network network) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.student = student;
        this.business = system;
        this.enterprise = enterprise;
        this.network = network;
        this.cusList = new ArrayList<>();
        this.histList = new ArrayList<>();
        dormServiceTbl.getTableHeader().setDefaultRenderer(new tableHeaderColors());
        histTbl.getTableHeader().setDefaultRenderer(new tableHeaderColors());
        invoiceTbl.getTableHeader().setDefaultRenderer(new tableHeaderColors());
        histItemTbl.getTableHeader().setDefaultRenderer(new tableHeaderColors());
        populateDormServiceTable();
    }

    private void populateDormServiceTable() {
        DefaultTableModel dtm = (DefaultTableModel) dormServiceTbl.getModel();
        dtm.setRowCount(0);
        for (Network net : business.getNetworkList()) {
            for (Enterprise e : net.getEnterpriseDirectory().getEnterpriseList()) {
                for (ServiceTypes s : e.getServiceTypeList()) {
                    Object row[] = new Object[2];
                    row[0] = s;
                    row[1] = s.getPrice();
                    dtm.addRow(row);
                }
            }
        }

        DefaultTableModel dtm1 = (DefaultTableModel) histTbl.getModel();
        dtm1.setRowCount(0);
        for (Network net : business.getNetworkList()) {
            for (Enterprise e : net.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    for (WorkRequest request : o.getWorkQueue().getWorkRequestList()) {
                        if (request.getReceiver() != null && request.getReceiver().getRole().toString().equals("Business.Role.ServiceWorkerRole")) {
                            if (request.getStatus().toLowerCase().equals("completed")) {
                                int ord = request.getRequestID();
                                Object row[] = new Object[4];
                                row[0] = ord;
                                row[1] = request.getRequestDate();
                                row[2] = request;
                                row[3] = ((MaintenanceWorkRequest) request).getTotalBill();
                                dtm1.addRow(row);
                            }
                        }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dormServiceTbl = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentNotes = new javax.swing.JTextArea();
        addToCartBtn = new javax.swing.JButton();
        delCartBtn = new javax.swing.JButton();
        placeOrderBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        invoiceTbl = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        totBillTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        histTbl = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        histItemTbl = new javax.swing.JTable();
        addToCartHistBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Maintenance Request Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 0, 1127, 37));

        backBtn.setBackground(new java.awt.Color(204, 204, 204));
        backBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        backBtn.setForeground(new java.awt.Color(51, 51, 51));
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 30));

        dormServiceTbl.setBackground(new java.awt.Color(204, 204, 204));
        dormServiceTbl.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        dormServiceTbl.setForeground(new java.awt.Color(51, 51, 51));
        dormServiceTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(dormServiceTbl);
        if (dormServiceTbl.getColumnModel().getColumnCount() > 0) {
            dormServiceTbl.getColumnModel().getColumn(0).setResizable(false);
            dormServiceTbl.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 149, -1, 93));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 204, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Services Available");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 452, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Message:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 99, 40));

        studentNotes.setBackground(new java.awt.Color(204, 204, 204));
        studentNotes.setColumns(20);
        studentNotes.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        studentNotes.setForeground(new java.awt.Color(51, 51, 51));
        studentNotes.setRows(5);
        jScrollPane2.setViewportView(studentNotes);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 260, 58));

        addToCartBtn.setBackground(new java.awt.Color(204, 204, 204));
        addToCartBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        addToCartBtn.setForeground(new java.awt.Color(51, 51, 51));
        addToCartBtn.setText("Add To Cart");
        addToCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addToCartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        delCartBtn.setBackground(new java.awt.Color(102, 204, 255));
        delCartBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        delCartBtn.setForeground(new java.awt.Color(51, 51, 51));
        delCartBtn.setText("Delete From Cart");
        delCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delCartBtnActionPerformed(evt);
            }
        });
        jPanel1.add(delCartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, -1, 49));

        placeOrderBtn.setBackground(new java.awt.Color(204, 204, 204));
        placeOrderBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        placeOrderBtn.setForeground(new java.awt.Color(51, 51, 51));
        placeOrderBtn.setText("Raise Request");
        placeOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderBtnActionPerformed(evt);
            }
        });
        jPanel1.add(placeOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 620, 125, 49));

        invoiceTbl.setBackground(new java.awt.Color(204, 204, 204));
        invoiceTbl.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        invoiceTbl.setForeground(new java.awt.Color(51, 51, 51));
        invoiceTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(invoiceTbl);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, 114));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Total Price:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 125, -1));

        totBillTxt.setEditable(false);
        totBillTxt.setBackground(new java.awt.Color(204, 204, 204));
        totBillTxt.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        totBillTxt.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(totBillTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 193, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 452, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 204, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Order History Details");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 440, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 60, 590));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1010, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 204, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cart Items");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 450, -1));

        histTbl.setBackground(new java.awt.Color(204, 204, 204));
        histTbl.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        histTbl.setForeground(new java.awt.Color(51, 51, 51));
        histTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Ordered Date", "Message", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(histTbl);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 440, 93));

        histItemTbl.setBackground(new java.awt.Color(204, 204, 204));
        histItemTbl.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        histItemTbl.setForeground(new java.awt.Color(51, 51, 51));
        histItemTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(histItemTbl);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, 114));

        addToCartHistBtn.setBackground(new java.awt.Color(204, 204, 204));
        addToCartHistBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        addToCartHistBtn.setForeground(new java.awt.Color(51, 51, 51));
        addToCartHistBtn.setText("Show Items");
        addToCartHistBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartHistBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addToCartHistBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 204, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Service Request History");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 452, -1));

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
            .addGap(0, 795, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void addToCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = dormServiceTbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            ServiceTypes s = (ServiceTypes) dormServiceTbl.getValueAt(selectedRow, 0);
            cartCount++;
            cusList.add(s);
            this.total = populateTable(cusList);
            totBillTxt.setText(this.total);
            JOptionPane.showMessageDialog(null, "Added to cart successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_addToCartBtnActionPerformed

    public String populateTable(ArrayList<ServiceTypes> cusList) {
        DefaultTableModel dtm = (DefaultTableModel) invoiceTbl.getModel();
        dtm.setRowCount(0);
        int totalBill = 0;
        for (int i = itemCount; i < cusList.size(); i++) {
            Object row[] = new Object[2];

            row[0] = cusList.get(i);
            row[1] = cusList.get(i).getPrice();
            totalBill = totalBill + cusList.get(i).getPrice();
            dtm.addRow(row);
        }

        return String.valueOf(totalBill);
    }

    private void delCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delCartBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = invoiceTbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            ServiceTypes s = (ServiceTypes) invoiceTbl.getValueAt(selectedRow, 0);
            cusList.remove(s);
            this.total = populateTable(cusList);
            totBillTxt.setText(this.total);

        }
    }//GEN-LAST:event_delCartBtnActionPerformed

    private void placeOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderBtnActionPerformed
        // TODO add your handling code here:
        if (invoiceTbl.getRowCount() > 0 && cartCount > 0) {
            MaintenanceWorkRequest request = new MaintenanceWorkRequest();
            request.setCusList(cusList);
            request.setSender(userAccount);
            request.setStatus("Request pending");
            request.setTotalBill(Integer.parseInt(totBillTxt.getText()));
            request.setMessage(studentNotes.getText());
            Organization org = null;
            for (Network net : business.getNetworkList()) {
                for (Enterprise enter : net.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enter instanceof MaintenanceEnterprise) {
                        for (Organization organization : enter.getOrganizationDirectory().getOrganizationList()) {
                            if (organization instanceof ServiceOrganization) {
                                org = organization;
                                break;
                            }
                        }
                    }
                }
            }

            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(request);
                userAccount.getWorkQueue().getWorkRequestList().add(request);
                populateTable(new ArrayList<ServiceTypes>());
                studentNotes.setText("");
                totBillTxt.setText("");
                JOptionPane.showMessageDialog(null, "Request raised successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please add the service to the cart to raise request.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

    }//GEN-LAST:event_placeOrderBtnActionPerformed

    private void addToCartHistBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartHistBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = histTbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            WorkRequest i = (WorkRequest) histTbl.getValueAt(selectedRow, 2);
            histList = ((MaintenanceWorkRequest) i).getCusList();
            System.out.println(histList.get(0));
            DefaultTableModel dtm = (DefaultTableModel) histItemTbl.getModel();
            dtm.setRowCount(0);
            for (int d = 0; d < histList.size(); d++) {
                System.out.println("servcoe" + histList.get(d).getServiceName());
                Object row[] = new Object[2];

                row[0] = histList.get(d).getServiceName();
                row[1] = histList.get(d).getPrice();
                dtm.addRow(row);
            }
        }

    }//GEN-LAST:event_addToCartHistBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartBtn;
    private javax.swing.JButton addToCartHistBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton delCartBtn;
    private javax.swing.JTable dormServiceTbl;
    private javax.swing.JTable histItemTbl;
    private javax.swing.JTable histTbl;
    private javax.swing.JTable invoiceTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton placeOrderBtn;
    private javax.swing.JTextArea studentNotes;
    private javax.swing.JTextField totBillTxt;
    // End of variables declaration//GEN-END:variables
}
