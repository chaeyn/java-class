package construct;

public class MemberConstruct2 {
    private String name;
    private int age;
    private int grade;

    public MemberConstruct2(String name) {
        this.name = name;
        this.age = 17;
        this.grade = 40;
    }

    public MemberConstruct2(String name, int age) {
        this(name, age, 50);
    }

    public MemberConstruct2(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
