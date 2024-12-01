/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import java.util.ArrayList;

/**
 *
 * @author siddheshsawant
 */
public class EcoSystem {
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private StudentRequestDirectory studentRequestDirectory;
    private EnterpriseDirectory enterpriseDirectory;
    
    private EcoSystem(){
        studentRequestDirectory = new StudentRequestDirectory();
        enterpriseDirectory = new EnterpriseDirectory();
        networkList = new ArrayList<>();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public static EcoSystem getBusiness() {
        return business;
    }
    public StudentRequestDirectory getStudentRequestDirectory() {
        return studentRequestDirectory;
    }

    public void setStudentRequestDirectory(StudentRequestDirectory studentRequestDirectory) {
        this.studentRequestDirectory = studentRequestDirectory;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }
    
    public static EcoSystem getInstance(){
        if(business == null){
            business = new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    public void removeNetwork(Network network){
        networkList.remove(network);
    }
    
        public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }   
    
}
