/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collection.list;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author fadillarizky
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    private ArrayList<String> studentName = new ArrayList();
    
    public void addStudents(String studentName, int idx) {
        if(idx == 1)
            this.studentName.add(studentName);
        else 
            this.studentName.add(idx, studentName);
    }
    
    public void removeStudents(String studentName){
        this.studentName.remove(studentName);
    }
    
}
