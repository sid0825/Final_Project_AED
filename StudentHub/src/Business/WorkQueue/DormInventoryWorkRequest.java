/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Enterprise.Items;
import java.util.ArrayList;

/**
 *
 * @author omkarsalian
 */
public class DormInventoryWorkRequest extends WorkRequest {

    private ArrayList<Items> cusList;
    private String cusMessage;
    private int totalBill = 0;

    public DormInventoryWorkRequest() {
    }

    public ArrayList<Items> getCusList() {
        return cusList;
    }

    public void setCusList(ArrayList<Items> cusList) {
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
