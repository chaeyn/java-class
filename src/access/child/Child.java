package access.child;

import access.parent.Parent1;

public class Child extends Parent1 {
    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속 관계는 접근 허용
//        defaultValue = 1;
//        privateValue = 1;
        printParent();
    }
}
