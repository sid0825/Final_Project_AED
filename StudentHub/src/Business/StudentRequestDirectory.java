/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author siddheshsawant
 */
public class StudentRequestDirectory {
     private ArrayList<StudentRequestOrder> studReqOrderList;

    public StudentRequestDirectory() {
        studReqOrderList = new ArrayList();
    }

    public ArrayList<StudentRequestOrder> getStudReqOrderList() {
        return studReqOrderList;
    }

    public void setStudReqOrderList(ArrayList<StudentRequestOrder> studReqOrderList) {
        this.studReqOrderList = studReqOrderList;
    } 

     public StudentRequestOrder createOrder(){
        StudentRequestOrder order = new StudentRequestOrder(); 
        studReqOrderList.add(order);
        return order;
    }
     
      public void deleteOrder(StudentRequestOrder order){
        studReqOrderList.remove(order); 
    }
    
}
