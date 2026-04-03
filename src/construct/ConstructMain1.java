package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct1 member1 = new MemberConstruct1("장강민", 18, 11);
        MemberConstruct1 member2 = new MemberConstruct1("김우성", 18, 22);

        MemberConstruct1[] members = {member1, member2};
        for (MemberConstruct1 m : members) {
            System.out.println("이름: " + m.getName() + " 나이: " + m.getAge() + " 성적: " + m.getGrade());
        }
    }
}
