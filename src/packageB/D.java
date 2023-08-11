package packageB;

import packageA.A;

public class D extends A {   // Method for accessing variables
    public void out(){
        A obj = new A();
        System.out.println("Access from another package, but child class");
        System.out.println("protected: " + super.c);   // super allows to access the protected variable
        System.out.println("public: " + obj.d);
    }
}
