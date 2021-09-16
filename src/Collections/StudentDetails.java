package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDetails {
    static  List<Student> studentList =new ArrayList<>();
    public static List<Student> studentList(){

        for (int i = 1; i <=10; i++) {
            Student std = new Student();
            std.setName("Lijo");
           float autoage = (float) Math.random()*100;
            if(i%2==0){
                continue;
            }
            int age =i*(int)autoage;
            std.setAge(age);
            std.setLocation("Rameswaram");
            studentList.add(std);
        }
        return studentList;
    }
    public static void dispStudent(){

        studentList();
        System.out.println("");
        Collections.sort(studentList,new ComparatorDemo());
        for (Student i: studentList){
            System.out.println(i.toString());
        }
    }
    public static List<Student> getList(){
        if(studentList== null){
            studentList();
        }
        return studentList;
    }
    public static void main(String[] args) {
        dispStudent();
    }
}
