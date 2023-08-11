package packageA;

public class B {

    public void out(){      // Method for accessing variables
        A obj = new A();
        System.out.println("Access from another class, but the same package: ");
        System.out.println("default: " + obj.b);
        System.out.println("protected: " + obj.c);
        System.out.println("public: " + obj.d);
    }
}
