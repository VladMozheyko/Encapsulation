package packageA;

public class A {
    private int a = 1;      // Fields
    int b = 2;
    protected int c = 3;
    public int d = 4;


    public void out(){                 // Method for accessing variables
        System.out.println("Access from class");
        System.out.println("private: " + a);
        System.out.println("default: " + b);
        System.out.println("protected: " + c);
        System.out.println("public: " + d);
    }
}
