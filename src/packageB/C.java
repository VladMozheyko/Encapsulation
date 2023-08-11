package packageB;

import packageA.A;

public class C {

    public void out(){     // Method for accessing variables
        A obj = new A();
        System.out.println("Access from another package");
        System.out.println("public: " + obj.d);
    }
}
