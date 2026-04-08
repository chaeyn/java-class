package exclass.b;

import exclass.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 3;
        data.publicMethod();

//      data.defaultField = 2;
//      data.defaultMethod();

//      data.privateField = 3;
//      data.privateMethod();

        data.innerAccess();
    }
}
