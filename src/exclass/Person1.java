package exclass;

public class Person1 {
    private String name;
    private int age;

    private Job1 job1;

    public Person1(String name, int age, Job1 job1) {
        this.name = name;
        this.age = age;
        this.job1 = job1;
    }

    public void introduce() {
        System.out.println("안녕하세요. 제 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");
        if (job1 != null) {
            System.out.println("직업: " + job1.getTitle());
        }
    }
}
