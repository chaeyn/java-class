package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit1 member1 = new MemberInit1();
        member1.setGrade(10);
        member1.setAge(18);
        member1.setName("안녕");

        MemberInit1 member2 = new MemberInit1();
        member2.setGrade(10);
        member2.setAge(18);
        member2.setName("장강민");

        MemberInit1[] members = {member1, member2};
        for (MemberInit1 m : members) {
            System.out.println("이름: " + m.getName() + " 나이: " + m.getAge() + " 성적: " + m.getGrade());
        }
    }
}
