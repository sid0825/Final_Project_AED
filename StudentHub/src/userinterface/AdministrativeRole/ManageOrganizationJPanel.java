/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.utilities.tableHeaderColors;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author omkarsalian
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        organizationJTable.getTableHeader().setDefaultRenderer(new tableHeaderColors());
        populateTable();
        populateCombo();
    }

    private void populateCombo() {
        organizationJComboBox.removeAllItems();
        String ent = enterprise.getEnterpriseType().toString();
        for (Type type : Organization.Type.values()) {
            if (ent.equals("Diet Unit")) {
                if (type.getValue().equals(Type.Nutrition.getValue())) {
                    organizationJComboBox.addItem(type);
                }
            } else if (ent.equals("Trainer Unit")) {
                if (type.getValue().equals(Type.FitnessTraining.getValue())) {
                    organizationJComboBox.addItem(type);
                }
                if (type.getValue().equals(Type.WeightTraining.getValue())) {
                    organizationJComboBox.addItem(type);
                }

            } else if (ent.equals("Doctor Unit")) {
                if (type.getValue().equals(Type.GeneralPractitioner.getValue())) {
                    organizationJComboBox.addItem(type);
                }
                if (type.getValue().equals(Type.Physiotherapist.getValue())) {
                    organizationJComboBox.addItem(type);
                }
//                if (type.getValue().equals(Type.Orthopedic.getValue())) {
//                    organizationJComboBox.addItem(type);
//                }

            } else if (ent.equals("Dorm Inventory Unit")) {
                if (type.getValue().equals(Type.DormInventory.getValue())) {
                    organizationJComboBox.addItem(type);
                }
                if (type.getValue().equals(Type.Delivery.getValue())) {
                    organizationJComboBox.addItem(type);
                }
            } else if (ent.equals("Maintenance Unit")) {
                if (type.getValue().equals(Type.Service.getValue())) {
                    organizationJComboBox.addItem(type);
                }
                if (type.getValue().equals(Type.ServiceWorker.getValue())) {
                    organizationJComboBox.addItem(type);
                }
            }
        }
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();

            model.addRow(row);
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
        organizationJTable = new javax.swing.JTable();
        AddButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setBackground(new java.awt.Color(204, 204, 204));
        organizationJTable.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        organizationJTable.setForeground(new java.awt.Color(51, 51, 51));
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 480, 120));

        AddButton.setBackground(new java.awt.Color(51, 153, 255));
        AddButton.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 122, 42));

        organizationJComboBox.setBackground(new java.awt.Color(204, 204, 204));
        organizationJComboBox.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        organizationJComboBox.setForeground(new java.awt.Color(51, 51, 51));
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 190, 30));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Organization Type :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, -1, -1));

        BackButton.setBackground(new java.awt.Color(255, 51, 51));
        BackButton.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        BackButton.setForeground(new java.awt.Color(51, 51, 51));
        BackButton.setText("<< Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, -1, 30));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(51, 204, 255));
        enterpriseLabel.setText("Manage Organization");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 270, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundLogo.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 110, 110));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundFoot.png"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 264, 52));
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed

        Type type = (Type) organizationJComboBox.getSelectedItem();
        String t = String.valueOf(type) + " Organization";
        System.out.println("TTTTT" + t);
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org.getName().equals(t)) {
                JOptionPane.showMessageDialog(null, "Organization is already added !", "Alert", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        enterprise.getOrganizationDirectory().createOrganization(type);
        populateTable();
    }//GEN-LAST:event_AddButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
