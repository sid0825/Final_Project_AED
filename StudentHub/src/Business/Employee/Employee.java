/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

import java.util.Random;

/**
 *
 * @author Sumeet
 */
public class Employee {
    
    private String name;
    private static int count = 0;
    private int id;
    private int min = 1000;
    private int max = 9999;


    public Employee() {
        Random r = new Random();
        count = r.nextInt(max-min) + min;
        id = count;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
