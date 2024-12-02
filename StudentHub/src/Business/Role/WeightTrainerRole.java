/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.WeightTrainerRole.WeightTrainerWorkAreaJPanel;

/**
 *
 * @author siddheshsawant
 */
public class WeightTrainerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem business, Network network) {
        
        return new WeightTrainerWorkAreaJPanel(userProcessContainer, enterprise, organization, account, business, network);
    }
    
}
