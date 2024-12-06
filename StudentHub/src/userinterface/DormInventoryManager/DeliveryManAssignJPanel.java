/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DormInventoryManager;

//import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.StudentRequestOrder;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DormInventoryWorkRequest;
import java.awt.CardLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author omkarsalian
 */
public class DeliveryManAssignJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private StudentRequestOrder order;
    private EcoSystem business;
    private Enterprise enterprise;
    private DormInventoryWorkRequest request;

    /**
     * Creates new form DeliveryManAssignJPanel
     */
    DeliveryManAssignJPanel(JPanel userProcessContainer, EcoSystem business, Enterprise enterprise, DormInventoryWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.request = request;
        this.enterprise = enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        deliveryManCmbBox = new javax.swing.JComboBox<>();
        appointDelManBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Assign Deliveryman");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 310, 37));

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

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Deliveryman:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 80, -1));

        deliveryManCmbBox.setBackground(new java.awt.Color(204, 204, 204));
        deliveryManCmbBox.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        deliveryManCmbBox.setForeground(new java.awt.Color(51, 51, 51));
        deliveryManCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(deliveryManCmbBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 150, 30));

        appointDelManBtn.setBackground(new java.awt.Color(204, 204, 204));
        appointDelManBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        appointDelManBtn.setForeground(new java.awt.Color(51, 51, 51));
        appointDelManBtn.setText("Appoint");
        appointDelManBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointDelManBtnActionPerformed(evt);
            }
        });
        add(appointDelManBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 95, 36));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundLogo.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 100));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundFoot.png"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 264, 52));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void appointDelManBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointDelManBtnActionPerformed
        // TODO add your handling code here:
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount user : org.getUserAccountDirectory().getUserAccountList()) {
                if (deliveryManCmbBox.getSelectedItem().equals(user.getEmployee().getName())) {
                    request.setReceiver(user);
                    request.setStatus("Deliverman Assigned");
                    user.getWorkQueue().getWorkRequestList().add(request);
                    JOptionPane.showMessageDialog(null, "Deliveryman assigned successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_appointDelManBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appointDelManBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> deliveryManCmbBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    
}
