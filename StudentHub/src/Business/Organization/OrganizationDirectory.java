/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author Sumeet
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;

        if (type.getValue().equals(Organization.Type.Nutrition.getValue())){
            organization = new NutritionOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.WeightTraining.getValue())){
            organization = new WeightTrainingOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.FitnessTraining.getValue())){
            organization = new FitnessTrainingOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.Physiotherapist.getValue())){
            organization = new PhysioOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.GeneralPractitioner.getValue())){
            organization = new GenPracOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.DormInventory.getValue())){
            organization = new InventoryOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.Delivery.getValue())){
            organization = new DeliveryOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.Service.getValue())){
            organization = new ServiceOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.ServiceWorker.getValue())){
            organization = new ServiceWorkerOrganization();
            organizationList.add(organization);
        }
      
        return organization;
    }
    
}
