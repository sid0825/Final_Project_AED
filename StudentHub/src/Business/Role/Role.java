/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import javax.swing.JPanel;

/**
 *
 * @author siddheshsawant
 */
public abstract class Role {
    
    public enum RoleType{
        
        Admin("Admin"),
        MaintenanceAdmin("Maintenance Admin"),
        Student("Student"),
        Doctor("Doctor"), /*TBR*/
        DoctorAdmin("Doctor Admin"),
        TrainerAdmin("Trainer Admin"),
        DietAdmin("Diet Admin"),
        Nutritionist("Nutritionist"),
        Dietician("Dietician"),
        GeneralPhysician("General Physician"),
        Physiotherapist("Physiotherapist"),
        DormInventoryManager("Dorm Inventory Manager"),
        DeliveryMan("Delivery Man"),
        ServiceProvider("Service Provider"),
        ServiceWorker("Service Worker"),
        FitnessTrainer("Fitness Trainer"),
        WeightTrainer("Weight Trainer");
               
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer,  
            Enterprise enterprise, 
            Network network
    );

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
