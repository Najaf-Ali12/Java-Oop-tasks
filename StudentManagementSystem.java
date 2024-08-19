class Student{
    String name,Rollno;
    Double[] marks;
    Student(String name,String Rollno, Double[] marks){
        this.Rollno=Rollno;
        this.name=name;
        this.marks=marks;
    }
    public double calculateAverageMarks(){
        double totalmarks=0;
        int subjects=marks.length;
        for (double each:marks){
            totalmarks+=each;
        }
        return totalmarks/subjects;

    }
    public void displayStudentDetails(){
        System.out.println("Name: "+name);
        System.out.println("Rollno: "+Rollno);
        System.out.println("Marks: ");
        for (double eachmark:marks){
            System.out.println(eachmark);
        }
    }
    public boolean ispassed(double passpercentage){
        if (passpercentage<=calculateAverageMarks()){
            return true;
        }
        else{
            return false;
        }
    }
}
public class StudentManagementSystem{
    public static void main(String[] args) {
        Student[] students=new Student[2];
        double totalaveragemarks=0;
        double passpercentage=50;
        Double[] marks1={9.00,7.90,2.45};
        Double[] marks2={95.80,64.90,89.45};
        students[0]=new Student("Najaf Ali", "23ai01",marks1);
        students[1]=new Student("Aftab Ahmed", "23AI03", marks2);
        for (Student eachStudent:students){
            eachStudent.displayStudentDetails();
            boolean passingresult=eachStudent.ispassed(passpercentage);
            System.out.println("Passed:" +passingresult);
        }
        for (Student student : students) {
            double averagemark=student.calculateAverageMarks();
            System.out.println("Average marks of "+student.Rollno+" are "+averagemark);
            totalaveragemarks += averagemark;
        }
        double classAverage = totalaveragemarks / students.length;
        System.out.println("Class Average Marks: " + classAverage);
    }
}