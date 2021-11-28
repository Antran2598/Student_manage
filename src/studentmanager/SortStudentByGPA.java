/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanager;
import java.util.Comparator;


/**
 * SortStudentByGPA class
 *
 * @author ThangPham
 */
public class SortStudentByGPA implements Comparator<Student>{
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getGpa() > student2.getGpa()) {
            return 1;
        }
        return -1;
    }
}
