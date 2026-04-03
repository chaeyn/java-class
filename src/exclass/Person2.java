package exclass;

public class Person2 {
    private String name;
    private int age;
    private Job2 job;

    public Person2(String name, int age, String title, String company) {
        this.name = name;
        this.age = age;
        this.job = new Job2(title, company);
    }

    public void introduce() {
        System.out.println("안녕하세요. 제 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");
        if (job != null) {
            System.out.println("직업: " + job.getTitle());
        }
    }
}
