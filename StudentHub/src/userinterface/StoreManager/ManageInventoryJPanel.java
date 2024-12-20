/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StoreManager;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Items;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.utilities.tableHeaderColors;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sumeet
 */
public class ManageInventoryJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAcc;
    // private Restaurant restaurant;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount account;
    private EcoSystem business;
    private boolean priceValid;
    private boolean itemValid;

    /**
     * Creates new form ManageMenuJPanel
     */
    ManageInventoryJPanel(JPanel userProcessContainer, Organization organization, EcoSystem business, Enterprise enterprise, UserAccount account) {
        initComponents();
        this.organization = organization;
        this.enterprise = enterprise;
        this.account = account;
        this.business = business;
        itemLbl.setVisible(false);
        itemSuccessLbl.setVisible(false);
        priceLbl.setVisible(false);
        price0lbl.setVisible(false);
        menuTbl.getTableHeader().setDefaultRenderer(new tableHeaderColors());
        priceSuccessLbl.setVisible(false);
        this.userProcessContainer = userProcessContainer;
        populateTable();
    }

    private boolean cityPatternCorrect(String val3) {
        Pattern p = Pattern.compile("^[a-zA-Z ]+$");
        Matcher m = p.matcher(val3);
        boolean b = m.matches();
        return b;
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
        menuTbl = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        itemNameTxt = new javax.swing.JTextField();
        priceTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        itemLbl = new javax.swing.JLabel();
        itemSuccessLbl = new javax.swing.JLabel();
        priceLbl = new javax.swing.JLabel();
        priceSuccessLbl = new javax.swing.JLabel();
        price0lbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox<>();
        priceLbl1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuTbl.setBackground(new java.awt.Color(204, 204, 204));
        menuTbl.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        menuTbl.setForeground(new java.awt.Color(51, 51, 51));
        menuTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Item Type", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(menuTbl);
        if (menuTbl.getColumnModel().getColumnCount() > 0) {
            menuTbl.getColumnModel().getColumn(0).setResizable(false);
            menuTbl.getColumnModel().getColumn(1).setResizable(false);
            menuTbl.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 221, -1, 130));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Item Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 100, 30));

        itemNameTxt.setBackground(new java.awt.Color(204, 204, 204));
        itemNameTxt.setForeground(new java.awt.Color(51, 51, 51));
        itemNameTxt.setMinimumSize(new java.awt.Dimension(7, 25));
        itemNameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                itemNameTxtKeyReleased(evt);
            }
        });
        add(itemNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 150, 30));

        priceTxt.setBackground(new java.awt.Color(204, 204, 204));
        priceTxt.setForeground(new java.awt.Color(51, 51, 51));
        priceTxt.setMinimumSize(new java.awt.Dimension(7, 25));
        priceTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priceTxtKeyReleased(evt);
            }
        });
        add(priceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 150, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Price:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 130, 30));

        backButton.setBackground(new java.awt.Color(255, 51, 51));
        backButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(51, 51, 51));
        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 30));

        addButton.setBackground(new java.awt.Color(51, 153, 255));
        addButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, 100, 40));

        deleteButton.setBackground(new java.awt.Color(51, 153, 255));
        deleteButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 80, 40));

        itemLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        itemLbl.setForeground(new java.awt.Color(255, 51, 51));
        itemLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemLbl.setText("Only Alphabets are allowed");
        add(itemLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 150, 20));

        itemSuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/tick.png"))); // NOI18N
        add(itemSuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 30, -1));

        priceLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        priceLbl.setForeground(new java.awt.Color(255, 51, 51));
        priceLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceLbl.setText("Only Numbers Allowed");
        add(priceLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 160, 20));

        priceSuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/tick.png"))); // NOI18N
        add(priceSuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 30, -1));

        price0lbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        price0lbl.setForeground(new java.awt.Color(255, 51, 51));
        price0lbl.setText("Price Should be Greater than 0");
        add(price0lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Item Type:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 60, 30));

        typeComboBox.setBackground(new java.awt.Color(204, 204, 204));
        typeComboBox.setForeground(new java.awt.Color(51, 51, 51));
        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Equipments", "Supplements" }));
        add(typeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 150, 30));

        priceLbl1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        priceLbl1.setForeground(new java.awt.Color(255, 51, 51));
        priceLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceLbl1.setText("Only Numbers Allowed");
        add(priceLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 160, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundLogo.png"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 110, 100));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(51, 204, 255));
        enterpriseLabel.setText("Store Inventory Management");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 410, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) menuTbl.getModel();
        dtm.setRowCount(0);

        for (Items store : enterprise.getItemsList()) {
            Object row[] = new Object[3];
            row[0] = store;
            row[1] = store.getItemType();
            row[2] = store.getPrice();
            dtm.addRow(row);
        }
    }
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        if (priceValid && itemValid) {

            for (Items item : enterprise.getItemsList()) {
                if (itemNameTxt.getText().equals(item.getItemName())) {

                    JOptionPane.showMessageDialog(null, "Item already exists.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            if (itemNameTxt.getText().equals("") || itemNameTxt.getText() == null) {
                JOptionPane.showMessageDialog(null, "Field(s) cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!itemNameTxt.getText().matches("^[a-zA-Z0-9 ]*$")) {
                JOptionPane.showMessageDialog(null, "Invalid Item Name.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
                Double.parseDouble(priceTxt.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid Price.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (Double.parseDouble(priceTxt.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, "Price should be greater than zero.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String name = itemNameTxt.getText();
            String type = (String) typeComboBox.getSelectedItem();
            int price = Integer.parseInt(priceTxt.getText());
            Items s = enterprise.createMenuItem();
            s.setItemName(name);
            s.setItemType(type);
            s.setPrice(price);
            JOptionPane.showMessageDialog(null, "Item Added Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            populateTable();
            itemNameTxt.setText("");
            priceTxt.setText("");
            typeComboBox.setSelectedIndex(0);
            itemSuccessLbl.setVisible(false);
            priceSuccessLbl.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(null, "Please enter all the required fields correctly!", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_addButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = menuTbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            Items item = (Items) menuTbl.getValueAt(selectedRow, 0);
            enterprise.deleteItem(item);
            JOptionPane.showMessageDialog(null, "Item deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            populateTable();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void itemNameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemNameTxtKeyReleased
        // TODO add your handling code here:
        if (!cityPatternCorrect(itemNameTxt.getText()) && !(itemNameTxt.getText().isEmpty())) {
            itemSuccessLbl.setVisible(false);
            itemValid = false;
            itemLbl.setVisible(true);
        } else {
            itemLbl.setVisible(false);
            itemValid = true;
            itemSuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_itemNameTxtKeyReleased

    private void priceTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceTxtKeyReleased
        // TODO add your handling code here:
        if (priceTxt.getText().isEmpty()) {
            priceValid = false;
            priceSuccessLbl.setVisible(false);
            priceLbl.setVisible(false);
            price0lbl.setVisible(false);
            return;
        }
        int price = 0;
        try {
            price = Integer.parseInt(priceTxt.getText());
            if (price > 0) {
                priceValid = true;
                priceSuccessLbl.setVisible(true);
                priceLbl.setVisible(false);
                price0lbl.setVisible(false);
                return;
            } else if (price == 0 || price < 0) {
                priceValid = false;
                priceSuccessLbl.setVisible(false);
                price0lbl.setVisible(true);
                priceLbl.setVisible(false);
                return;
            }
        } catch (NumberFormatException e) {
            if (!priceTxt.getText().isEmpty()) {
                priceValid = false;
                priceSuccessLbl.setVisible(false);
                priceLbl.setVisible(true);
                price0lbl.setVisible(false);
                return;
            } else {
                priceValid = false;
                priceLbl.setVisible(false);
                price0lbl.setVisible(false);
                priceSuccessLbl.setVisible(true);
                return;
            }
        }
    }//GEN-LAST:event_priceTxtKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel itemLbl;
    private javax.swing.JTextField itemNameTxt;
    private javax.swing.JLabel itemSuccessLbl;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable menuTbl;
    private javax.swing.JLabel price0lbl;
    private javax.swing.JLabel priceLbl;
    private javax.swing.JLabel priceLbl1;
    private javax.swing.JLabel priceSuccessLbl;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JComboBox<String> typeComboBox;
    // End of variables declaration//GEN-END:variables
}
