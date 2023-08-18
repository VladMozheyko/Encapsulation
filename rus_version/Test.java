import packageA.A;
import packageA.B;
import packageB.C;
import packageB.D;

public class Test {

    public static void main(String[] args) {

        A a = new A();         // Objects
        B b = new B();
        C c = new C();
        D d = new D();

        a.out();           // Output
        b.out();
        c.out();
        d.out();
    }
}
