import java.util.HashMap;

import Student.Grade;

class Student{
    String name;
    int id;
    HashMap<String,Double> student_grade_info;
    Student(String name,int id, HashMap<String,Double> student_info){
        this.id=id;
        this.name=name;
        student_grade_info=student_info;
    }
    class Grade{
        public void AddGrade(String subject,double marks){
            student_grade_info.put(subject, marks);
            System.out.println("Grade of " +subject+" is added Successfully");

        }
        public void ShowGrade(){
            for (String eachSubject:student_grade_info.keySet()){
                System.out.println(eachSubject+" : "+student_grade_info.get(eachSubject));
            }
        }
    }

}
public class StudentGradeManagementSystem_using_InnerClass{
    public static void main(String[] args) {
        HashMap<String,Double> hashmap_to_pass=new HashMap<>();
        Student student_obj=new Student("Najaf Ali", 01, hashmap_to_pass);
        Student.Grade grade_obj=student_obj.new Grade();
        grade_obj.AddGrade("English", 90);
        grade_obj.AddGrade("Math", 99);
        grade_obj.AddGrade("Physics", 95);
        grade_obj.ShowGrade();
    }
}