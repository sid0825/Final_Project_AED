/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.NutritionistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sumeet
 */
public class NutritionOrganization extends Organization {

    public NutritionOrganization() {
        super(Type.Nutrition.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new NutritionistRole());
        return roles;
    }   
}
