/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Enterprise.ServiceTypes;
import java.util.ArrayList;

/**
 *
 * @author omkarsalian
 */
public class MaintenanceWorkRequest extends WorkRequest {
    
    private ArrayList<ServiceTypes> cusList;
    private String cusMessage;
    private int totalBill = 0;

    public MaintenanceWorkRequest() {} 
    
    public ArrayList<ServiceTypes> getCusList() {
        return cusList;
    }

    public void setCusList(ArrayList<ServiceTypes> cusList) {
        this.cusList = cusList;
    }

    public String getCusMessage() {
        return cusMessage;
    }

    public void setCusMessage(String cusMessage) {
        this.cusMessage = cusMessage;
    }
    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }
}

