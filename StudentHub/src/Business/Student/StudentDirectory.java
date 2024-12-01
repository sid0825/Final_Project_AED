/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Student;

import java.util.ArrayList;

/**
 *
 * @author siddheshsawant
 */
public class StudentDirectory {
    
    private ArrayList<Student> studentList;

    public StudentDirectory() {
        studentList = new ArrayList<>();
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    
    public Student createStudent(Student student){
        studentList.add(student);
        return student;
    }
    
    public void removeStudent(Student c){
        studentList.remove(c);
    }
    
    public boolean checkIfUsernameIsUnique(String email){
        for (Student e : studentList){
            if (e.getEmail().equals(email))
                return false;
        }
        return true;
    }
    
    public Student updateStudent(Student cus, String name, Double height, Double weight, String gender, int age, String address, String city, String zipcode){
        cus.setName(name);
        cus.setHeight(height);
        cus.setWeight(weight);
        cus.setGender(gender);
        cus.setAge(age);
        cus.setAddress(address);
        cus.setCity(city);
        
        return cus;
    }
    
}
