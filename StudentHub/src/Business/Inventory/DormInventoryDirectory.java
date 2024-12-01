/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Inventory;

import java.util.ArrayList;

/**
 *
 * @author siddheshsawant
 */
public class DormInventoryDirectory {
    private ArrayList<DormInventory> dormInventoryList;
    
    public DormInventoryDirectory() {
        dormInventoryList = new ArrayList<>();
    }
    
    public ArrayList<DormInventory> getDormInventoryList() {
        return dormInventoryList;
    }
    
    public DormInventory createItem(DormInventory dormInventory){
        dormInventoryList.add(dormInventory);
        return dormInventory;
    }
    
    public DormInventory updateItem(DormInventory dormInventory,String itemName, int price){
        dormInventory.setItemName(itemName);
        dormInventory.setPrice(price);
        return dormInventory;
    }
    
}
