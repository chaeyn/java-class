package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit2 member1 = new MemberInit2();
        member1.initMember("장강민", 18, 30);

        MemberInit2 member2 = new MemberInit2();
        member2.initMember("김우성", 18, 22);

        MemberInit2[] members = {member1, member2};
    }
}
