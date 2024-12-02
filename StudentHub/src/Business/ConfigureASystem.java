/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author omkarsalian
 */
public class ConfigureASystem {
    
        public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();

        Employee employee = system.getEmployeeDirectory().createEmployee("admin");
        
        // Create system admin
        UserAccount userAccount = system.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new SystemAdminRole());
        
        return system;
    }
    
}
