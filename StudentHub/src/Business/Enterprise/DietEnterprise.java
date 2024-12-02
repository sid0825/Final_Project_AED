/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author omkarsalian
 */
public class DietEnterprise extends Enterprise {

    public DietEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.DietUnit);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

}
