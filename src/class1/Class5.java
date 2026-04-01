package class1;

public class Class5 {
    public static void main(String[] args) {
        Student1[] student1s = new Student1[]{
            new Student1("김우성", 18, 50),
            new Student1("장강민", 18, 44)
        };

        for (Student1 stu: student1s) {
            stu.showData();
        }
    }
}
