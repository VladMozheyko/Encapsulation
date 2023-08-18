import packageA.A;

public class C {

    public void out(){     // Метод для доступа к переменным
        A obj = new A();
        System.out.println("Доступ из другого пакета");
        System.out.println("public: " + obj.d);
    }
}
