package packageA;

public class B {

    public void out(){      //Метод для доступа к данным
        A obj = new A();
        System.out.println("Доступ из другого класса в том же пакете: ");
        System.out.println("default: " + obj.b);
        System.out.println("protected: " + obj.c);
        System.out.println("public: " + obj.d);
    }
}
