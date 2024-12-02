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
public class DoctorEnterprise extends Enterprise {

    public DoctorEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.DoctorUnit);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
