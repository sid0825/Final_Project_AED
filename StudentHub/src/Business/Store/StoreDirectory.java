/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Store;

import java.util.ArrayList;

/**
 *
 * @author siddheshsawant
 */
public class StoreDirectory {
    private ArrayList<Store> storeList;
    
    public StoreDirectory() {
        storeList = new ArrayList<>();
    }
    
    public ArrayList<Store> getStoreList() {
        return storeList;
    }
    
    public Store createItem(Store store){
        storeList.add(store);
        return store;
    }
    
    public Store updateItem(Store store,String itemName,String itemType, int price){
        store.setItemName(itemName);
        store.setItemType(itemType);
        store.setPrice(price);
        return store;
    }
    
}
