package class1;

public class Student {
    String name;
    int studentId;
    int grade;

    public Student(String name, int studentId, int grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    public void introduce() {
        System.out.println("저는 " + this.grade + "학년 " + this.studentId + " " + this.name + " 입니다");
    }
}
