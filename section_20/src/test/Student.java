package test;

public class Student extends Person{

    private String studentNo;

    public Student(String name, int age, String studentNo) {
        super(name, age);
        this.studentNo = studentNo;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public void study(){
        System.out.println("I love studying.");
    }

    public void eat(){
        System.out.println("Student is eating.");
    }

    public void sleep(){
        System.out.println("Student is sleeping.");
    }
}
